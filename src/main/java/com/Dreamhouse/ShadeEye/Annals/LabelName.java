package com.Dreamhouse.ShadeEye.Annals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LabelName(String labelAndTag)
{}
