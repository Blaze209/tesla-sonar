package vi0;

import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lvi0/g;", "", "", "fontFamilyName", ImagesContract.URL, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fontFamilyName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StyleElements.FontWeight fontWeight;

    public g(String str, String str2, StyleElements.FontWeight fontWeight) {
        this.fontFamilyName = str;
        this.url = str2;
        this.fontWeight = fontWeight;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFontFamilyName() {
        return this.fontFamilyName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StyleElements.FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
