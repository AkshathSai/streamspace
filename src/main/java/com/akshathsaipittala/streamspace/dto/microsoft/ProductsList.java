package com.akshathsaipittala.streamspace.dto.microsoft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductsList (
        ArrayList<Preview> previews,
        String subtitleNarratorText,
        String typeTag,
        String ratingCountFormatted,
        String iconUrl,
        String pdpImageUrl,
        Object largePromotionImage,
        String posterArtUrl,
        String boxArtUrl,
        Object heroImageUrl,
        String iconUrlBackground,
        Object trailers,
        ArrayList<Object> screenshots,
        String encodedTitle,
        boolean isMovie,
        boolean isApplication,
        boolean isGame,
        boolean isTvSeries,
        boolean isMoviesOrTVs,
        boolean isPwa,
        boolean isCoreGame,
        boolean isAllowed,
        boolean isBrowsable,
        boolean isAd,
        boolean isPrimeVideo,
        boolean isSparkProduct,
        boolean isAndroid,
        String redirectUrl,
        boolean isPartOfLocaleAssessment,
        boolean isHardware,
        boolean isSubscription,
        Object platforms,
        Object privacyUrl,
        Object additionalTermLinks,
        Object legalUrl,
        boolean accessible,
        boolean isDeviceCompanionApp,
        Object supportUris,
        Object features,
        Object notes,
        Object supportedLanguages,
        Object publisherCopyrightInformation,
        Object publisherAddress,
        Object publisherPhoneNumber,
        Object additionalLicenseTerms,
        Object appWebsiteUrl,
        Object productRatings,
        Object requiredHardware,
        Object recommendedHardware,
        Object hardwareWarnings,
        Object permissionsRequired,
        Object packageAndDeviceCapabilities,
        Object version,
        Date lastUpdateDateUtc,
        Object skus,
        Object osProductInformation,
        Object categoryId,
        Object subcategoryId,
        Object navItemId,
        Object navId,
        Object addOnPriceRange,
        Object recurrencePolicy,
        Object deviceFamilyDisallowedReason,
        Object builtFor,
        Object revisionId,
        Object pdpBackgroundColor,
        boolean containsDownloadPackage,
        Object systemRequirements,
        Object keyIds,
        Object allowedPlatforms,
        Object xbox360ContentMediaId,
        Object earlyAdopterEnrollmentUrl,
        Object installationTerms,
        Object skuDisplayGroups,
        boolean xboxXpa,
        Object relatedPackageIdentities,
        Object primaryPackageIdentity,
        Object detailsDisplayConfiguration,
        Object ownershipType,
        Object offerExpirationDate,
        Object warningMessages,
        Object deviceQualified,
        Object isMicrosoftProduct,
        Object productFamilyLicenseTerms,
        Object hasParentBundles,
        Object hasAlternateEditions,
        Object isLtidCompatible,
        Object productPartD,
        String videoProductType,
        boolean isMsixvc,
        Object position,
        Object parentId,
        Object categoryIds,
        Object mediaBadges,
        Object isEligibleForMoviesAnywhere,
        Object copyrightInformation,
        Installer installer,
        Object catalogSource,
        Object webAppStartUrl,
        ArrayList<String> categories,
        ArrayList<Image> images,
        String productId,
        String title,
        Object shortTitle,
        String subtitle,
        String description,
        Object shortDescription,
        String developerName,
        String publisherName,
        Object publisherId,
        boolean isUniversal,
        Object language,
        Object bgColor,
        Object fgColor,
        double price,
        String displayPrice,
        Object strikethroughPrice,
        Object recentLowestPriceMessage,
        Object displayPricePrefix,
        Object buyActionTitleOverride,
        Object buyActionSubtitle,
        boolean currencyMismatch,
        Object promoMessage,
        Object promoEndDateUtc,
        double averageRating,
        int ratingCount,
        boolean hasFreeTrial,
        Object productType,
        String productFamilyName,
        Object mediaType,
        ArrayList<Object> contentIds,
        ArrayList<Object> packageFamilyNames,
        Object recommendationReason,
        Object releaseNotes,
        Object subcategoryName,
        Object alternateId,
        Object alternateIds,
        Object curatedBGColor,
        Object curatedFGColor,
        Object curatedImageUrl,
        Object curatedTitle,
        Object curatedDescription,
        Object doNotFilter,
        String collectionItemType,
        Object curatedVideoUri,
        Object creativeId,
        Object payloadId,
        Object contentType,
        Object artistName,
        Object artistId,
        Object albumTitle,
        Object albumProductId,
        Object isExplicit,
        int numberOfSeasons,
        Date releaseDateUtc,
        int durationInSeconds,
        Object isCompatible,
        Object isSoftBlocked,
        Object isPurchaseEnabled,
        Object incompatibleReason,
        boolean developerOptOutOfSDCardInstall,
        boolean hasAddOns,
        boolean hasThirdPartyIAPs,
        Object externalUri,
        Object autosuggestSubtitle,
        Object merchandizedProductType,
        Object voiceTitle,
        Object phraseCustomPronunciation,
        Object plaintextPassName,
        Object glyphTextPassName,
        Object subscriptionDiscountMessageTemplate,
        Object capabilitiesTable,
        Object capabilities,
        boolean hideFromCollections,
        Object isDownloadable,
        boolean hideFromDownloadsAndUpdates,
        Object incompatibleLink,
        Object incompatibleLabel,
        boolean gamingOptionsXboxLive,
        Object actionOverrides,
        String availableDevicesDisplayText,
        String availableDevicesNarratorText,
        Object models,
        Object capabilityXboxEnhanced,
        ArrayList<Badge> badges,
        Object catalogId,
        Object hasParentBundle,
        Object acquiredDateUtc,
        Object approximateSizeInBytes,
        Object maxInstallSizeInBytes,
        Object bundleIds,
        Object productActionsList,
        ArrayList<SkusSummary> skusSummary,
        Object colorPicker,
        Object bundlePackageIdentities,
        Object pcgaShortDescription,
        Object pcgaTrailer,
        Object pcgaMinimumUserAge,
        boolean isGamingAppOnly,
        Object installerType,
        Object appExtension,
        boolean supportsInstantGaming,
        boolean requireDeviceRegistration,
        String schema) {
}
