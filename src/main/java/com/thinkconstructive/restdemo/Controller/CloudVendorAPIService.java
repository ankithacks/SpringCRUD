package com.thinkconstructive.restdemo.Controller;

import com.thinkconstructive.restdemo.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    // get the request
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        // return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
        return cloudVendor;
    }

    // Post request
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "CLoud vendor created!!";
    }

    // update the post
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "CLoud vendor updated successfully!!!!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "CLoud vendor deleted successfully!!!!";
    }

}
