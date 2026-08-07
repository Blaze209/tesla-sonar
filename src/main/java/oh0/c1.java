package oh0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import y20.Snapshot;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003)%'B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\u000e*\u00180\u0011R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00032$\u0010\u001f\u001a 0\u001eR\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Loh0/c1;", "Ly20/k;", "Loh0/c1$c;", "Loh0/c1$b;", "Loh0/c1$a;", "", "Landroid/content/Context;", "applicationContext", "Loh0/e0$a;", "permissionRequestWorkerFactory", "Loh0/x;", "deviceFeatureRequestWorkflow", "<init>", "(Landroid/content/Context;Loh0/e0$a;Loh0/x;)V", "Ljn0/h0;", "I", "()V", "Ly20/r$c;", "Ly20/r;", "Loh0/h1;", "output", "G", "(Ly20/r$c;Loh0/h1;)V", "props", "Ly20/i;", "snapshot", "H", "(Loh0/c1$c;Ly20/i;)Loh0/c1$b;", "renderProps", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "J", "(Loh0/c1$c;Loh0/c1$b;Ly20/k$a;)Ljava/lang/Object;", "state", "h0", "(Loh0/c1$b;)Ly20/i;", "a", "Landroid/content/Context;", "b", "Loh0/e0$a;", "c", "Loh0/x;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 extends y20.k<Props, b, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0.a permissionRequestWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x deviceFeatureRequestWorkflow;

    /* JADX INFO: renamed from: oh0.c1$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Loh0/c1$a;", "", "Loh0/h1;", "permissionState", "<init>", "(Loh0/h1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh0/h1;", "()Loh0/h1;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PermissionState permissionState;

        public Output(PermissionState permissionState) {
            p013kotlin.jvm.internal.s.k(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && p013kotlin.jvm.internal.s.f(this.permissionState, ((Output) other).permissionState);
        }

        public int hashCode() {
            return this.permissionState.hashCode();
        }

        public String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Loh0/c1$b;", "Landroid/os/Parcelable;", "<init>", "()V", "c", "b", "h", "f", "e", "a", "g", DateTokenConverter.CONVERTER_KEY, "Loh0/c1$b$a;", "Loh0/c1$b$b;", "Loh0/c1$b$c;", "Loh0/c1$b$d;", "Loh0/c1$b$e;", "Loh0/c1$b$f;", "Loh0/c1$b$g;", "Loh0/c1$b$h;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$a;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f97348a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C2092a();

            /* JADX INFO: renamed from: oh0.c1$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2092a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f97348a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -367421189;
            }

            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: oh0.c1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$b;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2093b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2093b f97349a = new C2093b();
            public static final Parcelable.Creator<C2093b> CREATOR = new a();

            /* JADX INFO: renamed from: oh0.c1$b$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C2093b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C2093b createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return C2093b.f97349a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C2093b[] newArray(int i11) {
                    return new C2093b[i11];
                }
            }

            private C2093b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2093b);
            }

            public int hashCode() {
                return -1860465355;
            }

            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$c;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f97350a = new c();
            public static final Parcelable.Creator<c> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return c.f97350a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            private c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -885686570;
            }

            public String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$d;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f97351a = new d();
            public static final Parcelable.Creator<d> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return d.f97351a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i11) {
                    return new d[i11];
                }
            }

            private d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1563807797;
            }

            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$e;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f97352a = new e();
            public static final Parcelable.Creator<e> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return e.f97352a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i11) {
                    return new e[i11];
                }
            }

            private e() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1821218195;
            }

            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$f;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f97353a = new f();
            public static final Parcelable.Creator<f> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return f.f97353a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i11) {
                    return new f[i11];
                }
            }

            private f() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -2052298174;
            }

            public String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$g;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f97354a = new g();
            public static final Parcelable.Creator<g> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return g.f97354a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i11) {
                    return new g[i11];
                }
            }

            private g() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1723010119;
            }

            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/c1$b$h;", "Loh0/c1$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f97355a = new h();
            public static final Parcelable.Creator<h> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return h.f97355a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i11) {
                    return new h[i11];
                }
            }

            private h() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 120525746;
            }

            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: oh0.c1$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b(\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b&\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b*\u0010,R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\"¨\u0006/"}, d2 = {"Loh0/c1$c;", "", "Loh0/d0;", "permission", "", "optional", "", "title", "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Loh0/d0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loh0/d0;", "f", "()Loh0/d0;", "b", "Z", "e", "()Z", "c", "Ljava/lang/String;", "k", DateTokenConverter.CONVERTER_KEY, "h", IntegerTokenConverter.CONVERTER_KEY, "g", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "l", "isPermissionLocation", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Props {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d0 permission;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean optional;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rationale;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rationaleWhenPermanentlyDenied;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String positiveButtonText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String negativeButtonText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gpsFeatureTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gpsFeatureRationale;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gpsFeatureModalNegativeButton;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyle styles;

        public Props(d0 permission, boolean z11, String title, String rationale, String rationaleWhenPermanentlyDenied, String str, String str2, String str3, String str4, String str5, StepStyle stepStyle) {
            p013kotlin.jvm.internal.s.k(permission, "permission");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(rationale, "rationale");
            p013kotlin.jvm.internal.s.k(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
            this.permission = permission;
            this.optional = z11;
            this.title = title;
            this.rationale = rationale;
            this.rationaleWhenPermanentlyDenied = rationaleWhenPermanentlyDenied;
            this.positiveButtonText = str;
            this.negativeButtonText = str2;
            this.gpsFeatureTitle = str3;
            this.gpsFeatureRationale = str4;
            this.gpsFeatureModalNegativeButton = str5;
            this.styles = stepStyle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGpsFeatureModalNegativeButton() {
            return this.gpsFeatureModalNegativeButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getOptional() {
            return this.optional;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.permission == props.permission && this.optional == props.optional && p013kotlin.jvm.internal.s.f(this.title, props.title) && p013kotlin.jvm.internal.s.f(this.rationale, props.rationale) && p013kotlin.jvm.internal.s.f(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && p013kotlin.jvm.internal.s.f(this.positiveButtonText, props.positiveButtonText) && p013kotlin.jvm.internal.s.f(this.negativeButtonText, props.negativeButtonText) && p013kotlin.jvm.internal.s.f(this.gpsFeatureTitle, props.gpsFeatureTitle) && p013kotlin.jvm.internal.s.f(this.gpsFeatureRationale, props.gpsFeatureRationale) && p013kotlin.jvm.internal.s.f(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && p013kotlin.jvm.internal.s.f(this.styles, props.styles);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d0 getPermission() {
            return this.permission;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getRationale() {
            return this.rationale;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.permission.hashCode() * 31) + Boolean.hashCode(this.optional)) * 31) + this.title.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.rationaleWhenPermanentlyDenied.hashCode()) * 31;
            String str = this.positiveButtonText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode6 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRationaleWhenPermanentlyDenied() {
            return this.rationaleWhenPermanentlyDenied;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean l() {
            d0 d0Var = this.permission;
            return d0Var == d0.RoughLocation || d0Var == d0.PreciseLocation;
        }

        public String toString() {
            return "Props(permission=" + this.permission + ", optional=" + this.optional + ", title=" + this.title + ", rationale=" + this.rationale + ", rationaleWhenPermanentlyDenied=" + this.rationaleWhenPermanentlyDenied + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalNegativeButton=" + this.gpsFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97367a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97367a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", f = "PermissionRequestWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97368n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Props f97370p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y20.k<Props, b, Output, Object>.a f97371q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Props props, y20.k<? super Props, b, Output, ? extends Object>.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f97370p = props;
            this.f97371q = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(y20.r.c cVar) {
            cVar.e(b.e.f97352a);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(y20.r.c cVar) {
            cVar.e(b.C2093b.f97349a);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return c1.this.new e(this.f97370p, this.f97371q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f97368n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (l1.b(c1.this.applicationContext, this.f97370p.getPermission())) {
                this.f97371q.c().b(y20.z.d(c1.this, null, new wn0.l() { // from class: oh0.d1
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return c1.e.c((y20.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f97371q.c().b(y20.z.d(c1.this, null, new wn0.l() { // from class: oh0.e1
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return c1.e.e((y20.r.c) obj2);
                    }
                }, 1, null));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", f = "PermissionRequestWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97372n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Props, b, Output, Object>.a f97373o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c1 f97374p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Props f97375q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(y20.k<? super Props, b, Output, ? extends Object>.a aVar, c1 c1Var, Props props, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f97373o = aVar;
            this.f97374p = c1Var;
            this.f97375q = props;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(c1 c1Var, Props props, y20.r.c cVar) {
            c1Var.G(cVar, new PermissionState(props.getPermission(), g1.PermissionGranted));
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f97373o, this.f97374p, this.f97375q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f97372n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super Props, b, ? extends Output>> hVarC = this.f97373o.c();
            final c1 c1Var = this.f97374p;
            final Props props = this.f97375q;
            hVarC.b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.f1
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return c1.f.b(c1Var, props, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public c1(Context applicationContext, e0.a permissionRequestWorkerFactory, x deviceFeatureRequestWorkflow) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        p013kotlin.jvm.internal.s.k(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(y20.r<? super Props, b, Output>.c cVar, PermissionState permissionState) {
        cVar.d(new Output(permissionState));
    }

    private final void I() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 K(y20.k.a aVar, c1 c1Var, final boolean z11) {
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.g0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.L(z11, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L(boolean z11, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (z11) {
            action.e(b.h.f97355a);
        } else {
            action.e(b.f.f97353a);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r M(final c1 c1Var, final y20.k.a aVar, final Props props, e0.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, e0.b.C2094b.f97384a)) {
            return y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.a1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.Q(aVar, c1Var, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, e0.b.a.f97383a)) {
            return y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.b1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.N(aVar, c1Var, props, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N(y20.k.a aVar, final c1 c1Var, final Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (((Props) action.b()).getOptional()) {
            aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.o0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.O(this.f97467a, props, (y20.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.p0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.P((y20.r.c) obj);
                }
            }, 1, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionRejected));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(b.a.f97348a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q(y20.k.a aVar, c1 c1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.n0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.R((y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(b.e.f97352a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r S(final c1 c1Var, final y20.k.a aVar, final Props props, final x.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.m0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.T(it, aVar, c1Var, props, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T(x.Output output, y20.k.a aVar, final c1 c1Var, final Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = d.f97367a[output.getDeviceFeatureState().getResult().ordinal()];
        if (i11 == 1) {
            aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.s0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.U(this.f97480a, props, (y20.r.c) obj);
                }
            }, 1, null));
        } else if (i11 == 2) {
            c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionRejected));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.V(this.f97484a, props, (y20.r.c) obj);
                }
            }, 1, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionGranted));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.SettingsLaunched));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 W(final y20.k.a aVar, final c1 c1Var, final Props props, final boolean z11) {
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.X(z11, c1Var, props, aVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X(boolean z11, c1 c1Var, Props props, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (z11) {
            c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionRejected));
        } else {
            aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.r0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.Y((y20.r.c) obj);
                }
            }, 1, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(b.g.f97354a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z(final c1 c1Var, y20.k.a aVar, final Props props) {
        c1Var.I();
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.l0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.a0(this.f97434a, props, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a0(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.SettingsLaunched));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b0(y20.k.a aVar, final c1 c1Var, final Props props) {
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.c0(this.f97397a, props, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c0(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionRejected));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d0(y20.k.a aVar, c1 c1Var) {
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.j0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.e0((y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(b.f.f97353a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f0(y20.k.a aVar, final c1 c1Var, final Props props) {
        aVar.c().b(y20.z.d(c1Var, null, new wn0.l() { // from class: oh0.i0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c1.g0(this.f97402a, props, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g0(c1 c1Var, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c1Var.G(action, new PermissionState(props.getPermission(), g1.PermissionRejected));
        return jn0.h0.f84049a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b d(Props props, Snapshot snapshot) {
        p013kotlin.jvm.internal.s.k(props, "props");
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            Parcelable parcelable = null;
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                p013kotlin.jvm.internal.s.h(parcelable);
                p013kotlin.jvm.internal.s.j(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            b bVar = (b) parcelable;
            if (bVar != null) {
                return bVar;
            }
        }
        return b.c.f97350a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object f(final Props renderProps, b renderState, final y20.k<? super Props, b, Output, ? extends Object>.a context) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (p013kotlin.jvm.internal.s.f(renderState, b.c.f97350a)) {
            context.a("check_permission_state", new e(renderProps, context, null));
            return null;
        }
        if (p013kotlin.jvm.internal.s.f(renderState, b.C2093b.f97349a)) {
            return new ki0.k(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new wn0.l() { // from class: oh0.f0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.K(context, this, ((Boolean) obj).booleanValue());
                }
            }), ki0.j.NONE);
        }
        if (p013kotlin.jvm.internal.s.f(renderState, b.h.f97355a)) {
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(qh0.e.f105572z);
                p013kotlin.jvm.internal.s.j(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            wn0.a aVar = new wn0.a() { // from class: oh0.q0
                @Override // wn0.a
                public final Object invoke() {
                    return c1.d0(context, this);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(qh0.e.f105571y);
                p013kotlin.jvm.internal.s.j(negativeButtonText, "getString(...)");
            }
            return new ki0.k(new k(title, rationale, str, styles, aVar, negativeButtonText, new wn0.a() { // from class: oh0.u0
                @Override // wn0.a
                public final Object invoke() {
                    return c1.f0(context, this, renderProps);
                }
            }), ki0.j.NONE);
        }
        if (p013kotlin.jvm.internal.s.f(renderState, b.f.f97353a)) {
            y20.w.l(context, this.permissionRequestWorkerFactory.a(renderProps.getPermission()), p013kotlin.jvm.internal.o0.o(e0.class), "", new wn0.l() { // from class: oh0.v0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.M(this.f97493a, context, renderProps, (e0.b) obj);
                }
            });
            return null;
        }
        if (p013kotlin.jvm.internal.s.f(renderState, b.e.f97352a)) {
            if (renderProps.l()) {
                return y20.a.C2691a.a(context, this.deviceFeatureRequestWorkflow, new x.Props(k1.a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new wn0.l() { // from class: oh0.w0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return c1.S(this.f97496a, context, renderProps, (x.Output) obj);
                    }
                }, 4, null);
            }
            context.a("request_device_feature", new f(context, this, renderProps, null));
            return null;
        }
        if (p013kotlin.jvm.internal.s.f(renderState, b.a.f97348a)) {
            return new ki0.k(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new wn0.l() { // from class: oh0.x0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c1.W(context, this, renderProps, ((Boolean) obj).booleanValue());
                }
            }), ki0.j.NONE);
        }
        if (!p013kotlin.jvm.internal.s.f(renderState, b.g.f97354a)) {
            if (p013kotlin.jvm.internal.s.f(renderState, b.d.f97351a)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(qh0.e.A);
            p013kotlin.jvm.internal.s.j(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        wn0.a aVar2 = new wn0.a() { // from class: oh0.y0
            @Override // wn0.a
            public final Object invoke() {
                return c1.Z(this.f97521a, context, renderProps);
            }
        };
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(qh0.e.f105571y);
            p013kotlin.jvm.internal.s.j(negativeButtonText2, "getString(...)");
        }
        return new ki0.k(new k(title2, rationaleWhenPermanentlyDenied, str2, styles2, aVar2, negativeButtonText2, new wn0.a() { // from class: oh0.z0
            @Override // wn0.a
            public final Object invoke() {
                return c1.b0(context, this, renderProps);
            }
        }), ki0.j.NONE);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Snapshot g(b state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return a30.s.a(state);
    }
}
