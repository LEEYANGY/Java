package xyz.leeyangy.blog.controller.admmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xyz.leeyangy.blog.domain.Type;
import xyz.leeyangy.blog.service.TypeService;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public String types(@PageableDefault(size = 10, sort = {"id"}, direction = Sort.Direction.DESC)
                                Pageable pageable, Model model) {

        model.addAttribute("page", typeService.listType(pageable));
        System.out.println("--------- types 1---------");
        return "/admin/types";
    }

    @GetMapping("/types/input")
    public String input() {
        return "/admin/types-input";
    }

    // 打开修改页
    @GetMapping("/types/{id}/edit")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("type", typeService.getType(id));
        return "/admin/types-input";
    }

    // 删除
    @GetMapping("types/{id}/delete")
    public String delete(@PathVariable Long id) {
        typeService.deleteType(id);
        return "redirect:/admin/types";
    }

    @PostMapping("/types")
    public String post(@Valid Type type, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return "/admin/types";
        }
        Type t = typeService.saveType(type);

        System.out.println("--------- types 2---------");
        return "redirect:/admin/types";
    }

}
