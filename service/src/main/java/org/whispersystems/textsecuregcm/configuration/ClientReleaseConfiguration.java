/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.textsecuregcm.configuration;

import javax.validation.constraints.NotNull;
import java.time.Duration;

public record ClientReleaseConfiguration(@NotNull Duration refreshInterval) {
}
