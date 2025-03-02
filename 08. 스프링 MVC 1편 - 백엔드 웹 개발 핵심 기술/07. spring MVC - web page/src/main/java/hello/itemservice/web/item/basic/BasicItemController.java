package hello.itemservice.web.item.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor    // final이 붙은 멤버변수만 사용해서 생성자를 자동으로 만들어준다
public class BasicItemController {

    private final ItemRepository itemRepository;

    // 상품목록 (items) - thymeleaf
    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }

    // 상품상세 (item) - thymeleaf
    @GetMapping("/{itemId}")
    public String item(@PathVariable Long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/item";
    }

    // 상품 등록 Form (add) - thymeleaf
    @GetMapping("/add")
    public String addForm() {
        return "basic/addForm";
    }

    // 상품 등록 처리 Ver.1 (@RequestParam 사용) - thymeleaf
    //@PostMapping("/add")
    public String addItemV1(@RequestParam String itemName,
                            @RequestParam int price,
                            @RequestParam Integer quantity,
                            Model model) {

        Item item = new Item();
        item.setItemName(itemName);
        item.setPrice(price);
        item.setQuantity(quantity);

        itemRepository.save(item);

        model.addAttribute("item", item);

        return "basic/item";
    }

    // 상품 등록 처리 Ver.2 (@ModelAttribute 사용) - thymeleaf
    /**
     * model.addAttribute("item", item); 자동 추가
     */
    //@PostMapping("/add")
    //public String addItemV2(@ModelAttribute("item") Item item , Model model) {
    public String addItemV2(@ModelAttribute("item") Item item) {
        itemRepository.save(item);
        //model.addAttribute("item", item); //자동 추가 (생략 가능)

        return "basic/item";
    }

    // 상품 등록 처리 Ver.3 (@ModelAttribute 이름 생략) - thymeleaf
    /**
     *  @ModelAttribute name 생략 가능
     *  생략시 model에 저장되는 name은 클래스명 첫글자만 소문자로 등록 Item -> item
     */
    //@PostMapping("/add")
    public String addItemV3(@ModelAttribute Item item) {
        itemRepository.save(item);
        return "basic/item";
    }

    // 상품 등록 처리 Ver.4 (@ModelAttribute 자체 생략) - thymeleaf
    /**
     *  @ModelAttribute  자체 생략 가능
     */
    @PostMapping("/add")
    public String addItemV4(Item item) {
        itemRepository.save(item);
        return "basic/item";
    }


    // 상품 수정 Form
    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }

    // 상품 수정 처리 (리다이렉트)
    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId,
                       @ModelAttribute Item item) {
        itemRepository.update(itemId, item);
        return "redirect:/basic/items/{itemId}";
    }

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("사과 대추", 30000, 500));
        itemRepository.save(new Item("밤", 20000, 200));
    }
}
