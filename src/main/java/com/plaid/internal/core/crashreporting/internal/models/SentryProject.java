package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.link.R;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "", "projectNumber", "", "keyResId", "(II)V", "getKeyResId", "()I", "getProjectNumber", "LinkSdk", "Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject$LinkSdk;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SentryProject {
    private final int keyResId;
    private final int projectNumber;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject$LinkSdk;", "Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "()V", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LinkSdk extends SentryProject {
        public static final LinkSdk INSTANCE = new LinkSdk();

        private LinkSdk() {
            super(563, R.string.plaid_sentry_android_link_sdk_api_key, null);
        }
    }

    public /* synthetic */ SentryProject(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    public final int getKeyResId() {
        return this.keyResId;
    }

    public final int getProjectNumber() {
        return this.projectNumber;
    }

    private SentryProject(int i11, int i12) {
        this.projectNumber = i11;
        this.keyResId = i12;
    }
}
