version = "1.0.7"
description = "Play audio attachments directly in chat."

aliucord {
	changelog.set(
		"""
			# 1.0.7
			__Fixed__:
			* Wrong audio playing
			* Crash when switching guild/channel while playing audio
			* Audio being unplayable
			* .ogg files not showing length or time elapsed
			__Improvements__:
			* Accidental taps outside of seek bar when seeking no longer opens the file in the browser as it is blocked.
			* Added loading bar so the user cannot press play before the audio is initalised.
			Credit: https://github.com/Halkiion/rushiiMachine-aliucord-plugins

			# 1.0.6
			* Fix crash on ogg files

			# 1.0.5
			* Fix broken onPause hook

			# 1.0.4
			* Works well enough for me fuck this

			# 1.0.3
			* Support more audio formats

			# 1.0.2
			* Fix crash?

			# 1.0.1
			* Released
		""".trimIndent()
	)
	author("Zt", 289556910426816513L, hyperlink = true)
	author("Halkiion", 215249358608662528L, hyperlink = true)
	deploy.set(true)
}
