package arcranion.kelvin.util

import java.util.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

infix fun Locale.displayLanguageIn(inLocale: Locale): String {
    return this.getDisplayLanguage(inLocale)
}

infix fun Locale.displayCountryIn(inLocale: Locale): String {
    return this.getDisplayCountry(inLocale)
}

infix fun Locale.displayVariantIn(inLocale: Locale): String {
    return this.getDisplayVariant(inLocale)
}

infix fun Locale.displayScriptIn(inLocale: Locale): String {
    return this.getDisplayScript(inLocale)
}

infix fun Locale.displayedIn(inLocale: Locale): String {
    return this.getDisplayName(inLocale)
}


@OptIn(ExperimentalContracts::class)
@JvmName("displayLanguageInNullable")
infix fun Locale?.displayLanguageIn(inLocale: Locale): String? {
    contract {
        returnsNotNull() implies (this@displayLanguageIn != null)
        returns(null) implies (this@displayLanguageIn == null)
    }
    return this?.getDisplayLanguage(inLocale)
}

@OptIn(ExperimentalContracts::class)
@JvmName("displayCountryInNullable")
infix fun Locale?.displayCountryIn(inLocale: Locale): String? {
    contract {
        returnsNotNull() implies (this@displayCountryIn != null)
        returns(null) implies (this@displayCountryIn == null)
    }
    return this?.getDisplayCountry(inLocale)
}

@OptIn(ExperimentalContracts::class)
@JvmName("displayVariantInNullable")
infix fun Locale?.displayVariantIn(inLocale: Locale): String? {
    contract {
        returnsNotNull() implies (this@displayVariantIn != null)
        returns(null) implies (this@displayVariantIn == null)
    }
    return this?.getDisplayVariant(inLocale)
}

@OptIn(ExperimentalContracts::class)
@JvmName("displayScriptInNullable")
infix fun Locale?.displayScriptIn(inLocale: Locale): String? {
    contract {
        returnsNotNull() implies (this@displayScriptIn != null)
        returns(null) implies (this@displayScriptIn == null)
    }
    return this?.getDisplayScript(inLocale)
}

@OptIn(ExperimentalContracts::class)
@JvmName("displayedInNullable")
infix fun Locale?.displayedIn(inLocale: Locale): String? {
    contract {
        returnsNotNull() implies (this@displayedIn != null)
        returns(null) implies (this@displayedIn == null)
    }
    return this?.getDisplayName(inLocale)
}