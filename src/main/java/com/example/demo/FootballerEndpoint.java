package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pojoClasses.FootballerDetailsRequest;
import pojoClasses.FootballerDetailsResponse;

@Endpoint
public class FootballerEndpoint
{
    private static final String NAMESPACE_URI = "https://www.howtodoinjava.com/xml/school";

    private FootballerRepository footballerRepository;

    @Autowired
    public FootballerEndpoint(FootballerRepository footballerRepository)
    {
        this.footballerRepository = footballerRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "FootballerDetailsRequest")
    @ResponsePayload
    public FootballerDetailsResponse getFootballer(@RequestPayload FootballerDetailsRequest request)
    {
        FootballerDetailsResponse footballerDetailsResponse = new FootballerDetailsResponse();
        footballerDetailsResponse.setFootballer(footballerRepository.findFootballer(request.getName()));
        return footballerDetailsResponse;
    }

}
