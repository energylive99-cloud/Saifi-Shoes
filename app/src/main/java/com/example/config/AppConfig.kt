package com.example.config

/**
 * Centralized application configuration.
 * All core URLs and constants are maintained here to avoid hardcoded values.
 */
object AppConfig {
    /**
     * Primary live website URL for Saifi Shoes.
     * Centralized per architectural requirements.
     */
    const val WEBSITE_URL = "https://saifishoes.free.nf/"

    /**
     * Official application name.
     */
    const val APP_NAME = "Saifi Shoes"

    /**
     * Application package identifier.
     */
    const val PACKAGE_ID = "com.zain.saifishoes"

    /**
     * Supported external protocol schemes for intent delegation.
     */
    const val SCHEME_WHATSAPP = "whatsapp"
    const val SCHEME_TEL = "tel"
    const val SCHEME_MAILTO = "mailto"
    const val SCHEME_SMS = "sms"
    const val SCHEME_GEO = "geo"

    /**
     * Common domains allowed for in-app WebView rendering.
     */
    val TRUSTED_HOSTS = listOf(
        "saifishoes.free.nf"
    )
}
