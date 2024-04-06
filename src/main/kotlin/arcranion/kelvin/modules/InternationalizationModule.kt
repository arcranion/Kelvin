package arcranion.kelvin.modules

import arcranion.kelvin.util.displayedIn
import arcranion.radiant.extensions.brigadier.sendTranslated
import arcranion.radiant.extensions.brigadier.sender
import arcranion.radiant.extensions.brigadier.translate
import arcranion.radiant.extensions.bukkit.localeOrNull
import arcranion.radiant.extensions.radiant.brigadier
import arcranion.radiant.module.RadiantModule

object InternationalizationModule: RadiantModule() {
    override val name = "InternationalizationModule"

    override fun onInitialize() {
        registerCommands()
    }

    private fun registerCommands() {
        brigadier {
            command("locale") {
                runs {
                    val clientLocale = this.sender.localeOrNull()
                    val serviceLocale = i18n.matchLocale(this.sender)

                    val clientLocaleString = (clientLocale displayedIn serviceLocale) ?: translate("global.unknown")
                    val serviceLocaleString = serviceLocale displayedIn serviceLocale

                    sendTranslated("module.internationalization.locale.query.client", clientLocaleString)
                    sendTranslated("module.internationalization.locale.query.service", serviceLocaleString)
                    sendTranslated("module.internationalization.locale.query.footer")
                }

                literal("help") {
                    runs {
                        sendTranslated("module.internationalization.locale.help")
                    }
                }
            }
        }
    }

}