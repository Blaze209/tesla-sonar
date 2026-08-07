package oh0;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003'%#B\u0019\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u0010*\u00180\fR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00032$\u0010\u001d\u001a 0\u001cR\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Loh0/x;", "Ly20/k;", "Loh0/x$c;", "Loh0/x$a;", "Loh0/x$b;", "", "Landroid/content/Context;", "applicationContext", "Loh0/m$a;", "deviceFeatureRequestWorkerFactory", "<init>", "(Landroid/content/Context;Loh0/m$a;)V", "Ly20/r$c;", "Ly20/r;", "Loh0/a0;", "output", "Ljn0/h0;", "r", "(Ly20/r$c;Loh0/a0;)V", "s", "()V", "props", "Ly20/i;", "snapshot", "t", "(Loh0/x$c;Ly20/i;)Loh0/x$a;", "renderProps", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "u", "(Loh0/x$c;Loh0/x$a;Ly20/k$a;)Ljava/lang/Object;", "state", "D", "(Loh0/x$a;)Ly20/i;", "a", "Landroid/content/Context;", "b", "Loh0/m$a;", "c", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends y20.k<Props, a, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m.a deviceFeatureRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Loh0/x$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", DateTokenConverter.CONVERTER_KEY, "c", "b", "Loh0/x$a$a;", "Loh0/x$a$b;", "Loh0/x$a$c;", "Loh0/x$a$d;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        /* JADX INFO: renamed from: oh0.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/x$a$a;", "Loh0/x$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2098a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2098a f97501a = new C2098a();
            public static final Parcelable.Creator<C2098a> CREATOR = new C2099a();

            /* JADX INFO: renamed from: oh0.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2099a implements Parcelable.Creator<C2098a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C2098a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return C2098a.f97501a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C2098a[] newArray(int i11) {
                    return new C2098a[i11];
                }
            }

            private C2098a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2098a);
            }

            public int hashCode() {
                return -86189441;
            }

            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/x$a$b;", "Loh0/x$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f97502a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C2100a();

            /* JADX INFO: renamed from: oh0.x$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2100a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return b.f97502a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 92238675;
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

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/x$a$c;", "Loh0/x$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f97503a = new c();
            public static final Parcelable.Creator<c> CREATOR = new C2101a();

            /* JADX INFO: renamed from: oh0.x$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2101a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return c.f97503a;
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
                return 1991921803;
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

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh0/x$a$d;", "Loh0/x$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f97504a = new d();
            public static final Parcelable.Creator<d> CREATOR = new C2102a();

            /* JADX INFO: renamed from: oh0.x$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2102a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return d.f97504a;
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
                return 725044653;
            }

            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: oh0.x$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Loh0/x$b;", "", "Loh0/a0;", "deviceFeatureState", "<init>", "(Loh0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh0/a0;", "()Loh0/a0;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeviceFeatureState deviceFeatureState;

        public Output(DeviceFeatureState deviceFeatureState) {
            p013kotlin.jvm.internal.s.k(deviceFeatureState, "deviceFeatureState");
            this.deviceFeatureState = deviceFeatureState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeviceFeatureState getDeviceFeatureState() {
            return this.deviceFeatureState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && p013kotlin.jvm.internal.s.f(this.deviceFeatureState, ((Output) other).deviceFeatureState);
        }

        public int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        public String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }
    }

    /* JADX INFO: renamed from: oh0.x$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Loh0/x$c;", "", "Loh0/b0;", "feature", "", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Loh0/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh0/b0;", "()Loh0/b0;", "b", "Ljava/lang/String;", "e", "c", DateTokenConverter.CONVERTER_KEY, "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Props {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 feature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestFeatureTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestFeatureRationale;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestFeatureModalPositiveButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestFeatureModalNegativeButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyle styles;

        public Props(b0 feature, String str, String str2, String str3, String str4, StepStyle stepStyle) {
            p013kotlin.jvm.internal.s.k(feature, "feature");
            this.feature = feature;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getFeature() {
            return this.feature;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestFeatureModalNegativeButton() {
            return this.requestFeatureModalNegativeButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestFeatureModalPositiveButton() {
            return this.requestFeatureModalPositiveButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRequestFeatureRationale() {
            return this.requestFeatureRationale;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRequestFeatureTitle() {
            return this.requestFeatureTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.feature == props.feature && p013kotlin.jvm.internal.s.f(this.requestFeatureTitle, props.requestFeatureTitle) && p013kotlin.jvm.internal.s.f(this.requestFeatureRationale, props.requestFeatureRationale) && p013kotlin.jvm.internal.s.f(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && p013kotlin.jvm.internal.s.f(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && p013kotlin.jvm.internal.s.f(this.styles, props.styles);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        public String toString() {
            return "Props(feature=" + this.feature + ", requestFeatureTitle=" + this.requestFeatureTitle + ", requestFeatureRationale=" + this.requestFeatureRationale + ", requestFeatureModalPositiveButton=" + this.requestFeatureModalPositiveButton + ", requestFeatureModalNegativeButton=" + this.requestFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", f = "DeviceFeatureRequestWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97512n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y20.k<Props, a, Output, Object>.a f97514p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Props f97515q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(y20.k<? super Props, a, Output, ? extends Object>.a aVar, Props props, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f97514p = aVar;
            this.f97515q = props;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(x xVar, Props props, y20.r.c cVar) {
            xVar.r(cVar, new DeviceFeatureState(props.getFeature(), c0.Success));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(y20.r.c cVar) {
            cVar.e(a.d.f97504a);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return x.this.new d(this.f97514p, this.f97515q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f97512n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (hi0.f.b(x.this.applicationContext)) {
                y20.h<y20.r<? super Props, a, ? extends Output>> hVarC = this.f97514p.c();
                final x xVar = x.this;
                final Props props = this.f97515q;
                hVarC.b(y20.z.d(xVar, null, new wn0.l() { // from class: oh0.y
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return x.d.c(xVar, props, (y20.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f97514p.c().b(y20.z.d(x.this, null, new wn0.l() { // from class: oh0.z
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return x.d.e((y20.r.c) obj2);
                    }
                }, 1, null));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public x(Context applicationContext, m.a deviceFeatureRequestWorkerFactory) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = applicationContext;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A(x xVar, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        xVar.r(action, new DeviceFeatureState(props.getFeature(), c0.Success));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 B(x xVar, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        xVar.r(action, new DeviceFeatureState(props.getFeature(), c0.Failure));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C(x xVar, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        xVar.r(action, new DeviceFeatureState(props.getFeature(), c0.SettingsLaunched));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(y20.r<? super Props, a, Output>.c cVar, DeviceFeatureState deviceFeatureState) {
        cVar.d(new Output(deviceFeatureState));
    }

    private final void s() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v(y20.k.a aVar, x xVar) {
        aVar.c().b(y20.z.d(xVar, null, new wn0.l() { // from class: oh0.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.w((y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(a.c.f97503a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x(y20.k.a aVar, final x xVar, final Props props) {
        aVar.c().b(y20.z.d(xVar, null, new wn0.l() { // from class: oh0.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.y(this.f97491a, props, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 y(x xVar, Props props, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        xVar.r(action, new DeviceFeatureState(props.getFeature(), c0.Failure));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r z(final x xVar, final Props props, m.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof m.b.c) {
            return y20.z.d(xVar, null, new wn0.l() { // from class: oh0.s
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return x.A(this.f97478a, props, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof m.b.a) {
            return y20.z.d(xVar, null, new wn0.l() { // from class: oh0.t
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return x.B(this.f97482a, props, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof m.b.C2096b)) {
            throw new NoWhenBranchMatchedException();
        }
        xVar.s();
        return y20.z.d(xVar, null, new wn0.l() { // from class: oh0.u
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.C(this.f97486a, props, (y20.r.c) obj);
            }
        }, 1, null);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Snapshot g(a state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return a30.s.a(state);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a d(Props props, Snapshot snapshot) {
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
            a aVar = (a) parcelable;
            if (aVar != null) {
                return aVar;
            }
        }
        return a.C2098a.f97501a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object f(final Props renderProps, a renderState, final y20.k<? super Props, a, Output, ? extends Object>.a context) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (p013kotlin.jvm.internal.s.f(renderState, a.C2098a.f97501a)) {
            context.a("check_device_feature_state", new d(context, renderProps, null));
            return null;
        }
        if (!p013kotlin.jvm.internal.s.f(renderState, a.d.f97504a)) {
            if (!p013kotlin.jvm.internal.s.f(renderState, a.c.f97503a)) {
                if (p013kotlin.jvm.internal.s.f(renderState, a.b.f97502a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            y20.w.l(context, this.deviceFeatureRequestWorkerFactory.create(), p013kotlin.jvm.internal.o0.o(m.class), "", new wn0.l() { // from class: oh0.r
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return x.z(this.f97476a, renderProps, (m.b) obj);
                }
            });
            return null;
        }
        String requestFeatureTitle = renderProps.getRequestFeatureTitle();
        if (requestFeatureTitle == null) {
            requestFeatureTitle = "Couldn't access location feature";
        }
        String requestFeatureRationale = renderProps.getRequestFeatureRationale();
        if (requestFeatureRationale == null) {
            requestFeatureRationale = "Location is turned off, please allow access to your device's location feature";
        }
        String requestFeatureModalPositiveButton = renderProps.getRequestFeatureModalPositiveButton();
        if (requestFeatureModalPositiveButton == null) {
            requestFeatureModalPositiveButton = "Allow";
        }
        StepStyle styles = renderProps.getStyles();
        wn0.a aVar = new wn0.a() { // from class: oh0.p
            @Override // wn0.a
            public final Object invoke() {
                return x.v(context, this);
            }
        };
        String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
        if (requestFeatureModalNegativeButton == null) {
            requestFeatureModalNegativeButton = "Cancel";
        }
        return new ki0.k(new k(requestFeatureTitle, requestFeatureRationale, requestFeatureModalPositiveButton, styles, aVar, requestFeatureModalNegativeButton, new wn0.a() { // from class: oh0.q
            @Override // wn0.a
            public final Object invoke() {
                return x.x(context, this, renderProps);
            }
        }), ki0.j.NONE);
    }
}
