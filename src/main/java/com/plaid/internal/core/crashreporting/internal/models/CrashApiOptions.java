package com.plaid.internal.core.crashreporting.internal.models;

import ax.c;
import com.plaid.internal.C4571x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "", "projectId", "", "apiKey", "", "release", "(ILjava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getProjectId", "()I", "getRelease", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CrashApiOptions {

    @c("apiKey")
    private final String apiKey;

    @c("projectName")
    private final int projectId;

    @c("release")
    private final String release;

    public CrashApiOptions(int i11, String apiKey, String str) {
        s.k(apiKey, "apiKey");
        this.projectId = i11;
        this.apiKey = apiKey;
        this.release = str;
    }

    public static /* synthetic */ CrashApiOptions copy$default(CrashApiOptions crashApiOptions, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = crashApiOptions.projectId;
        }
        if ((i12 & 2) != 0) {
            str = crashApiOptions.apiKey;
        }
        if ((i12 & 4) != 0) {
            str2 = crashApiOptions.release;
        }
        return crashApiOptions.copy(i11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    public final CrashApiOptions copy(int projectId, String apiKey, String release) {
        s.k(apiKey, "apiKey");
        return new CrashApiOptions(projectId, apiKey, release);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashApiOptions)) {
            return false;
        }
        CrashApiOptions crashApiOptions = (CrashApiOptions) other;
        return this.projectId == crashApiOptions.projectId && s.f(this.apiKey, crashApiOptions.apiKey) && s.f(this.release, crashApiOptions.release);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final String getRelease() {
        return this.release;
    }

    public int hashCode() {
        int iA = C4571x.a(this.apiKey, Integer.hashCode(this.projectId) * 31, 31);
        String str = this.release;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CrashApiOptions(projectId=" + this.projectId + ", apiKey=" + this.apiKey + ", release=" + this.release + ")";
    }

    public /* synthetic */ CrashApiOptions(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, (i12 & 4) != 0 ? null : str2);
    }
}
