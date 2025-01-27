package com.akshathsaipittala.streamspace.media;

import org.springframework.content.commons.store.ContentStore;
import org.springframework.content.rest.StoreRestResource;
import org.springframework.stereotype.Component;

@Component
@StoreRestResource
public interface VideoContentStore extends ContentStore<Video, String> {

}