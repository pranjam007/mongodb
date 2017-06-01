package com.arqiva.keep2mongodb.controller;

import com.arqiva.keep2mongodb.entity.Site;
import com.arqiva.keep2mongodb.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

/**
 * Created by pranjal.mathur on 31/08/2016.
 */
@Controller
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;

    @RequestMapping(value = "/createSite")
    public String createSite(Model model, @RequestParam String siteName) {
        Site site = new Site();
        site.setSiteName(siteName);
        Random random = new Random();
        site.setSiteId(random.nextLong());
        site.setAgentName("James Bond");
        site.setTenantName("Jason Bourne");
        siteRepository.save(site);

        List<Site> sites = siteRepository.findAll();
        model.addAttribute("sites",sites);
        return "showSite";
    }

    @RequestMapping(value = "/listSites")
    public String createSite(Model model) {

        List<Site> sites = siteRepository.findAll();
        model.addAttribute("sites",sites);
        return "showSite";
    }

}
