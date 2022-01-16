/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.lsp.api;

/**
 * Settings contain preferences for the language server.
 * Clients can use settings to enable/disable specific features
 * of a server.
 *
 * @author Akash Yadav
 */
public interface IServerSettings {
    
    /**
     * Called by language server to check if the completions are enabled.
     * If not enabled, the server should not was time and memory computing
     * completions.
     *
     * @return {@code true} if enabled, {@code false} otherwise.
     */
    boolean completionsEnabled ();
    
    /**
     * Called by the language server to check if the code actions are enabled.
     * @return {@code true} if enabled, {@code false} otherwise.
     */
    boolean codeActionsEnabled ();
    
    /**
     * Called by the language server to check if the signature
     * help is enabled.
     * @return {@code true} if enabled, {@code false} otherwise.
     */
    boolean signatureHelpEnabled ();
}
