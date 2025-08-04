package jp.co.oasys.sample.motocatalog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.oasys.sample.motocatalog.beans.Brand;
import jp.co.oasys.sample.motocatalog.beans.Motocycle;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // ログ部品を使えるようにする
public class MotoController {

  @GetMapping("/motos")
  public String motos(Model model) {

    // ブランドリスト作成
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand("01", "Honda"));
    brands.add(new Brand("02", "KAWASAKI"));
    brands.add(new Brand("03", "YAMAHA"));
    brands.add(new Brand("04", "SUZUKI"));

    // バイクリスト作成
    List<Motocycle> motos = new ArrayList<>();
    motos.add(new Motocycle(1, "GB350", 800, 1, "空冷", 500000, "いい音", new Brand("01", "HONDA"), 1, null, null));
    motos.add(new Motocycle(2, "Ninja", 800, 2, "水冷", 1000000, "すいすい", new Brand("02", "KAWASAKI"), 1, null, null));
    motos.add(new Motocycle(3, "z900RS CAFE", 830, 4, "水冷", 3500000, "かっこいい", new Brand("03", "YAMAHA"), 1, null, null));
    motos.add(new Motocycle(4, "R2000SZ", 900, 2, "水冷", 2000000, "かわいい", new Brand("04", "SUZUKI"), 1, null, null));

    model.addAttribute("brands", brands);
    model.addAttribute("motos", motos);

    log.debug("motos : {}", motos); // ログ出力する
    

    return "moto-list";
  }
}
