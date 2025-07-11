package com.akshathsaipittala.streamspace.downloads;

import com.akshathsaipittala.streamspace.common.CONTENTTYPE;
import com.akshathsaipittala.streamspace.common.DOWNLOADTYPE;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class DownloadTask {

    @Id
    private String torrentHash;
    private String torrentName;
    private String movieCode;
    private double progress = 0;
    @Enumerated(EnumType.STRING)
    private CONTENTTYPE mediaType;
    @Enumerated(EnumType.STRING)
    private DOWNLOADTYPE downloadType;
    @CreatedDate
    private LocalDateTime createdDate;

    public DownloadTask(String torrentHash, String torrentName, String movieCode, CONTENTTYPE mediaType, DOWNLOADTYPE downloadType) {
        this.torrentHash = torrentHash;
        this.torrentName = torrentName;
        this.movieCode = movieCode;
        this.mediaType = mediaType;
        this.downloadType = downloadType;
        this.createdDate = LocalDateTime.now();
    }
}