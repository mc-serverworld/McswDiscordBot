/*
 * <one line to give the program's name and a brief idea of what it does.>
 *     Copyright (C) 2022-2022 chiliasmstudio
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.serverworld.McswDiscordBot;

import static com.serverworld.McswDiscordBot.MainBot.initialization_Main;

public class main {
    public static void main(String[] args) throws Exception{
        Config.LoadConfig(null);
        initialization_Main(Config.Token);
    }
}
