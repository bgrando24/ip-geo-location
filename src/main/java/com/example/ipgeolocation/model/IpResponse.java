package com.example.ipgeolocation.model;

/**
 * A model of the IP Geolocation API response
 * Reference: https://ip-api.com/docs/api:json
 */
public class IpResponse {
//    instance variables
    public String success;
    public String country;
    public String countryCode;
    public String region;
    public String regionName;
    public String city;
    public String zip;
    public double lat;
    public double lon;
    public String timezone;
    public String isp;

//    constructor
    public IpResponse(
            String success,
            String country,
            String countryCode,
            String region,
            String regionName,
            String city,
            String zip,
            double lat,
            double lon,
            String timezone,
            String isp
    ) {
        this.success = success;
        this.country = country;
        this.countryCode = countryCode;
        this.region = region;
        this.regionName = regionName;
        this.city = city;
        this.zip = zip;
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.isp = isp;
    }
}


//status	"success"
//country	"Australia"
//countryCode	"AU"
//region	"VIC"
//regionName	"Victoria"
//city	"Melbourne"
//zip	"3141"
//lat	-37.834
//lon	144.9832
//timezone	"Australia/Melbourne"
//isp	"Aussie Broadband"
//org	""
//as	"AS4764 Aussie Broadband"
//query	"180.150.32.208"