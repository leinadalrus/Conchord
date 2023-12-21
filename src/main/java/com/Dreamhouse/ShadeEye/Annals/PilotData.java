package com.Dreamhouse.ShadeEye.Annals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PilotData(String familyName, String givenName, String factionName,
                        String companyName, Long id)
{}
