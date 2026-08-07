package z00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: z00.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0018\u0010 R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000f¨\u0006%"}, d2 = {"Lz00/g;", "", "", "mode", "", "mimeTypes", "initialDirectoryUrl", "", "localOnly", "multiple", "requestLongTermAccess", "allowVirtualFiles", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "g", "h", "action", "intentFilterTypes", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String[] mimeTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initialDirectoryUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean localOnly;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean multiple;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requestLongTermAccess;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowVirtualFiles;

    public PickOptions(String str, String[] mimeTypes, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        s.k(mimeTypes, "mimeTypes");
        this.mode = str;
        this.mimeTypes = mimeTypes;
        this.initialDirectoryUrl = str2;
        this.localOnly = z11;
        this.multiple = z12;
        this.requestLongTermAccess = z13;
        this.allowVirtualFiles = z14;
    }

    public final String a() {
        return s.f("open", this.mode) ? "android.intent.action.OPEN_DOCUMENT" : "android.intent.action.GET_CONTENT";
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowVirtualFiles() {
        return this.allowVirtualFiles;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInitialDirectoryUrl() {
        return this.initialDirectoryUrl;
    }

    public final String d() {
        return s.f(a(), "android.intent.action.OPEN_DOCUMENT") ? "*/*" : n.T0(this.mimeTypes, "|", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getLocalOnly() {
        return this.localOnly;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickOptions)) {
            return false;
        }
        PickOptions pickOptions = (PickOptions) other;
        return s.f(this.mode, pickOptions.mode) && s.f(this.mimeTypes, pickOptions.mimeTypes) && s.f(this.initialDirectoryUrl, pickOptions.initialDirectoryUrl) && this.localOnly == pickOptions.localOnly && this.multiple == pickOptions.multiple && this.requestLongTermAccess == pickOptions.requestLongTermAccess && this.allowVirtualFiles == pickOptions.allowVirtualFiles;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String[] getMimeTypes() {
        return this.mimeTypes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getMultiple() {
        return this.multiple;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequestLongTermAccess() {
        return this.requestLongTermAccess;
    }

    public int hashCode() {
        String str = this.mode;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.mimeTypes)) * 31;
        String str2 = this.initialDirectoryUrl;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.localOnly)) * 31) + Boolean.hashCode(this.multiple)) * 31) + Boolean.hashCode(this.requestLongTermAccess)) * 31) + Boolean.hashCode(this.allowVirtualFiles);
    }

    public String toString() {
        return "PickOptions(mode=" + this.mode + ", mimeTypes=" + Arrays.toString(this.mimeTypes) + ", initialDirectoryUrl=" + this.initialDirectoryUrl + ", localOnly=" + this.localOnly + ", multiple=" + this.multiple + ", requestLongTermAccess=" + this.requestLongTermAccess + ", allowVirtualFiles=" + this.allowVirtualFiles + ")";
    }
}
