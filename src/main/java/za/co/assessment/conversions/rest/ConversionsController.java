package za.co.assessment.conversions.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversions")
public class ConversionsController {

    @RequestMapping("/ktoc")
    public double kToc(@PathVariable("kelvin") double kelvin) {

        return kelvin - 273;
    }

    @RequestMapping("/ctok")
    public double cTok(@PathVariable("celsius") double celsius) {
        return  celsius + 273;
    }

    @RequestMapping("/mtok")
    public double mTok(@PathVariable("kilometers") double kilometers) {
        return  kilometers/1.6;
    }

    @RequestMapping("/ktom")
    public double kTom(@PathVariable("miles") double miles) {
        return  miles*1.6;
    }

}
