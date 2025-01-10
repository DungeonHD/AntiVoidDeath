# AntiVoidDeath

**Prevents players from dying in the void in the End by teleporting them back to the Overworld at a specified location.**

## Features
- Detects when a player falls below a certain Y-coordinate in the End.
- Automatically teleports the player back to the Overworld at a customizable Y-coordinate.
- Includes an optional teleportation sound for better feedback.
- Easy-to-use configuration via `config.yml`.

## Configuration
The plugin includes a customizable `config.yml` file:
```yaml
# Enable or disable the plugin.
Enabled: true

# Y-coordinate in the End that triggers the teleport.
EndTeleportCoordinate: -60

# Teleportation sound settings.
TeleportSound:
  Enabled: true
  Sound: minecraft:block.portal.travel

# Y-coordinate in the Overworld where the player spawns after teleportation.
OverworldSpawnPosition: 320
```

## Installation
1. Download the latest release of the plugin from the [Releases](#) page.
2. Place the `.jar` file in your server's `plugins` folder.
3. Start the server to generate the default `config.yml` file.
4. Customize the configuration to suit your needs.
5. Restart the server to apply the changes.

## Usage
Simply install the plugin and configure the `config.yml` file as needed. The plugin will automatically handle void teleportation when players are in the End.

---

## License
This project is licensed under the MIT License:

```
MIT License

Copyright (c) 2025 DungeonHD

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## Contributing
Feel free to fork this repository and submit pull requests for:
- New features
- Bug fixes
- General improvements

## Support
If you encounter any issues or have questions, feel free to open an issue in this repository.

---
