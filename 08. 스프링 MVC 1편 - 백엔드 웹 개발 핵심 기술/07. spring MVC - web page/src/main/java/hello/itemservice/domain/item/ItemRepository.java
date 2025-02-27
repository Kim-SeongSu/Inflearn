package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ItemRepository {

    // ItemRepository - 상품 저장소

    private static final Map<Long, Item> store = new HashMap<>(); // HashMap은 싱글톤이므로 실무에서 동시에 사용할 목적으로 사용할거면, ConcurrentHashMap<>() 사용 권장!
    private static long sequence = 0L;  // 마찬가지로 long 대신 AtomicLong() 사용 추천!

    // 저장
    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    // 조회
    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    // 업데이트
    public void update(Long itemId, Item updateParam) {
        Item findItem = findById(itemId);

        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }


    // test용
    public void clearStore() {
        store.clear();
    }
}
