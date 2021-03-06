// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.offlinepages;

import org.chromium.base.VisibleForTesting;

/**
 * Simple object representing an offline page.
 */
public class OfflinePageItem {
    private final String mUrl;
    private final long mOfflineId;
    private final ClientId mClientId;
    private final String mOfflineUrl;
    private final long mFileSize;
    private final long mCreationTimeMs;
    private final int mAccessCount;
    private final long mLastAccessTimeMs;

    public OfflinePageItem(String url, long offlineId, String clientNamespace, String clientId,
            String offlineUrl, long fileSize, long creationTimeMs, int accessCount,
            long lastAccessTimeMs) {
        mUrl = url;
        mOfflineId = offlineId;
        mClientId = new ClientId(clientNamespace, clientId);
        mOfflineUrl = offlineUrl;
        mFileSize = fileSize;
        mCreationTimeMs = creationTimeMs;
        mAccessCount = accessCount;
        mLastAccessTimeMs = lastAccessTimeMs;
    }

    /** @return URL of the offline page. */
    @VisibleForTesting
    public String getUrl() {
        return mUrl;
    }

    /** @return offline id for this offline page. */
    @VisibleForTesting
    public long getOfflineId() {
        return mOfflineId;
    }

    /** @return Client Id related to the offline page. */
    @VisibleForTesting
    public ClientId getClientId() {
        return mClientId;
    }

    /** @return Path to the offline copy of the page. */
    @VisibleForTesting
    public String getOfflineUrl() {
        return mOfflineUrl;
    }

    /** @return Size of the offline copy of the page. */
    public long getFileSize() {
        return mFileSize;
    }

    /** @return Time in milliseconds the offline page was created. */
    public long getCreationTimeMs() {
        return mCreationTimeMs;
    }

    /** @return Number of times that the offline page has been accessed. */
    @VisibleForTesting
    public int getAccessCount() {
        return mAccessCount;
    }

    /** @return Last time in milliseconds the offline page has been accessed. */
    public long getLastAccessTimeMs() {
        return mLastAccessTimeMs;
    }
}
