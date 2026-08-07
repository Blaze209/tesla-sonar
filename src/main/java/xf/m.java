package xf;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lxf/m;", "", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lxf/m$a;", "Lxf/m$b;", "Lxf/m$c;", "Lxf/m$d;", "Lxf/m$e;", "Lxf/m$f;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxf/m$a;", "Lxf/m;", "assetName", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class a implements m {
        public final /* synthetic */ String a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxf/m$b;", "Lxf/m;", "uri", "Landroid/net/Uri;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class b implements m {
        public final /* synthetic */ Uri a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lxf/m$c;", "Lxf/m;", "", "fileName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String fileName;

        private /* synthetic */ c(String str) {
            this.fileName = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        public static String b(String fileName) {
            s.k(fileName, "fileName");
            return fileName;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof c) && s.f(str, ((c) obj).getFileName());
        }

        public static int d(String str) {
            return str.hashCode();
        }

        public static String e(String str) {
            return "File(fileName=" + str + ")";
        }

        public boolean equals(Object obj) {
            return c(this.fileName, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return d(this.fileName);
        }

        public String toString() {
            return e(this.fileName);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxf/m$d;", "Lxf/m;", "jsonString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class d implements m {
        public final /* synthetic */ String a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxf/m$f;", "Lxf/m;", ImagesContract.URL, "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class f implements m {
        public final /* synthetic */ String a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lxf/m$e;", "Lxf/m;", "", "resId", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getResId", "()I", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @vn0.b
    public static final class e implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int resId;

        private /* synthetic */ e(int i11) {
            this.resId = i11;
        }

        public static final /* synthetic */ e a(int i11) {
            return new e(i11);
        }

        public static boolean c(int i11, Object obj) {
            return (obj instanceof e) && i11 == ((e) obj).getResId();
        }

        public static int d(int i11) {
            return Integer.hashCode(i11);
        }

        public static String e(int i11) {
            return "RawRes(resId=" + i11 + ")";
        }

        public boolean equals(Object obj) {
            return c(this.resId, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return d(this.resId);
        }

        public String toString() {
            return e(this.resId);
        }

        public static int b(int i11) {
            return i11;
        }
    }
}
