package com.swmansion.rnscreens.gamma.tabs.image;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/image/a;", "", "<init>", "()V", "a", "b", "Lcom/swmansion/rnscreens/gamma/tabs/image/a$a;", "Lcom/swmansion/rnscreens/gamma/tabs/image/a$b;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class a {

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.image.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/image/a$a;", "Lcom/swmansion/rnscreens/gamma/tabs/image/a;", "", "resId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/swmansion/rnscreens/gamma/tabs/image/a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getResId", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrawableRes extends a {
        private final int resId;

        public DrawableRes(int i11) {
            super(null);
            this.resId = i11;
        }

        public static /* synthetic */ DrawableRes copy$default(DrawableRes drawableRes, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = drawableRes.resId;
            }
            return drawableRes.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public final DrawableRes copy(int resId) {
            return new DrawableRes(resId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DrawableRes) && this.resId == ((DrawableRes) other).resId;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resId);
        }

        public String toString() {
            return "DrawableRes(resId=" + this.resId + ")";
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.image.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/image/a$b;", "Lcom/swmansion/rnscreens/gamma/tabs/image/a;", "", "uri", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/swmansion/rnscreens/gamma/tabs/image/a$b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UriString extends a {
        private final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UriString(String uri) {
            super(null);
            s.k(uri, "uri");
            this.uri = uri;
        }

        public static /* synthetic */ UriString copy$default(UriString uriString, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uriString.uri;
            }
            return uriString.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final UriString copy(String uri) {
            s.k(uri, "uri");
            return new UriString(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UriString) && s.f(this.uri, ((UriString) other).uri);
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "UriString(uri=" + this.uri + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
