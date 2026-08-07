package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4183e6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f38291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4165c4 f38292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38296f;

    public C4183e6(Throwable error, C4165c4 translatedRectangle, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(translatedRectangle, "translatedRectangle");
        this.f38291a = error;
        this.f38292b = translatedRectangle;
        this.f38293c = i11;
        this.f38294d = i12;
        this.f38295e = "document_scan_step_failed";
        this.f38296f = "iglu:com.fourthline.sdk/document_scan_step_failed/jsonschema/1-0-0";
    }

    private final Throwable component1() {
        return this.f38291a;
    }

    private final C4165c4 component2() {
        return this.f38292b;
    }

    private final int component3() {
        return this.f38293c;
    }

    private final int component4() {
        return this.f38294d;
    }

    public static /* synthetic */ C4183e6 copy$default(C4183e6 c4183e6, Throwable th2, C4165c4 c4165c4, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            th2 = c4183e6.f38291a;
        }
        if ((i13 & 2) != 0) {
            c4165c4 = c4183e6.f38292b;
        }
        if ((i13 & 4) != 0) {
            i11 = c4183e6.f38293c;
        }
        if ((i13 & 8) != 0) {
            i12 = c4183e6.f38294d;
        }
        return c4183e6.copy(th2, c4165c4, i11, i12);
    }

    public final C4183e6 copy(Throwable error, C4165c4 translatedRectangle, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(translatedRectangle, "translatedRectangle");
        return new C4183e6(error, translatedRectangle, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4183e6)) {
            return false;
        }
        C4183e6 c4183e6 = (C4183e6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38291a, c4183e6.f38291a) && p013kotlin.jvm.internal.s.f(this.f38292b, c4183e6.f38292b) && this.f38293c == c4183e6.f38293c && this.f38294d == c4183e6.f38294d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a(AnalyticsAttribute.Error, this.f38291a), jn0.x.a("bitmap_width", Integer.valueOf(this.f38293c)), jn0.x.a("bitmap_height", Integer.valueOf(this.f38294d)), jn0.x.a("rectangle_left", Integer.valueOf(this.f38292b.getLeft())), jn0.x.a("rectangle_top", Integer.valueOf(this.f38292b.getTop())), jn0.x.a("rectangle_right", Integer.valueOf(this.f38292b.getRight())), jn0.x.a("rectangle_bottom", Integer.valueOf(this.f38292b.getBottom())), jn0.x.a("rectangle_width", Integer.valueOf(this.f38292b.width())), jn0.x.a("rectangle_height", Integer.valueOf(this.f38292b.height())));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38295e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38296f;
    }

    public int hashCode() {
        return (((((this.f38291a.hashCode() * 31) + this.f38292b.hashCode()) * 31) + Integer.hashCode(this.f38293c)) * 31) + Integer.hashCode(this.f38294d);
    }

    public String toString() {
        return "BitmapCroppingFailed(error=" + this.f38291a + ", translatedRectangle=" + this.f38292b + ", bitmapWidth=" + this.f38293c + ", bitmapHeight=" + this.f38294d + ")";
    }
}
