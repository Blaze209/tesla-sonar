package th0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.PeerConnectionFactory;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0018\u0019\u001a\u001b\u001c\u0011\u0015\u001d\u001e\u001f\u0005 !\"\u000e#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148 X \u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0010%&'()*+,-./01234¨\u00065"}, d2 = {"Lth0/x1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "Z", "getDidGoBack$selfie_release", "()Z", "r", "(Z)V", "didGoBack", "", "Lth0/a1;", "q", "()Ljava/util/List;", "selfies", "l", "()Lth0/x1;", "backState", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "cameraFacingMode", "j", "o", "h", "p", "k", "c", DateTokenConverter.CONVERTER_KEY, "g", "b", "e", "f", IntegerTokenConverter.CONVERTER_KEY, "n", "Lth0/x1$a;", "Lth0/x1$b;", "Lth0/x1$c;", "Lth0/x1$d;", "Lth0/x1$e;", "Lth0/x1$f;", "Lth0/x1$h;", "Lth0/x1$i;", "Lth0/x1$j;", "Lth0/x1$k;", "Lth0/x1$l;", "Lth0/x1$m;", "Lth0/x1$n;", "Lth0/x1$o;", "Lth0/x1$p;", "Lth0/x1$q;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class x1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean didGoBack;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8PX\u0090\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lth0/x1$b;", "Lth0/x1;", "nextState", "Lth0/a1$b;", "completedPose", "backState", "Lzf0/u$b;", "cameraFacingMode", "", "isFlashOn", "<init>", "(Lth0/x1;Lth0/a1$b;Lth0/x1;Lzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Lth0/x1;", "u", "()Lth0/x1;", "c", "Lth0/a1$b;", "s", "()Lth0/a1$b;", DateTokenConverter.CONVERTER_KEY, "l", "e", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "f", "Z", "v", "()Z", "", "Lth0/a1;", "q", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends x1 {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final x1 nextState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a1.b completedPose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isFlashOn;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new b((x1) parcel.readParcelable(b.class.getClassLoader()), a1.b.valueOf(parcel.readString()), (x1) parcel.readParcelable(b.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1 nextState, a1.b completedPose, x1 x1Var, zf0.u.b cameraFacingMode, boolean z11) {
            super(null);
            p013kotlin.jvm.internal.s.k(nextState, "nextState");
            p013kotlin.jvm.internal.s.k(completedPose, "completedPose");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.nextState = nextState;
            this.completedPose = completedPose;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashOn = z11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.nextState.q();
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final a1.b getCompletedPose() {
            return this.completedPose;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final x1 getNextState() {
            return this.nextState;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getIsFlashOn() {
            return this.isFlashOn;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.nextState, flags);
            dest.writeString(this.completedPose.name());
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashOn ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: th0.x1$c, reason: from toString */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\u009e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010-\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b6\u0010<R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b=\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b>\u0010HR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\bB\u0010NR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\b2\u0010QR&\u0010[\u001a\b\u0012\u0004\u0012\u00020V0\u00108\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bW\u0010G\u0012\u0004\bY\u0010Z\u001a\u0004\bX\u0010H¨\u0006\\"}, d2 = {"Lth0/x1$c;", "Lth0/x1;", "Lth0/z;", "", "countDown", "Ldg0/b;", "selfieError", "", "startCaptureTimestamp", "Lzf0/u;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Ldg0/a;", "brightnessInfo", "", "Lth0/a1$b;", "posesNeeded", "backState", "Lth0/s0;", "poseConfigs", "", "autoCaptureSupported", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ILdg0/b;JLzf0/u;JFLdg0/a;Ljava/util/List;Lth0/x1;Lth0/s0;ZLzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(ILdg0/b;JLzf0/u;JFLdg0/a;Ljava/util/List;Lth0/x1;Lth0/s0;ZLzf0/u$b;Z)Lth0/x1$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "w", "c", "Ldg0/b;", "y", "()Ldg0/b;", DateTokenConverter.CONVERTER_KEY, "J", "k", "()J", "e", "Lzf0/u;", "()Lzf0/u;", "f", "g", Gender.FEMALE, "x", "()F", "h", "Ldg0/a;", "v", "()Ldg0/a;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "j", "Lth0/x1;", "l", "()Lth0/x1;", "Lth0/s0;", "()Lth0/s0;", "Z", "a", "()Z", "m", "Lzf0/u$b;", "()Lzf0/u$b;", "n", "Lth0/a1;", "o", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends x1 implements z {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startCaptureTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float poseScore;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.a brightnessInfo;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                dg0.b bVarValueOf = parcel.readInt() == 0 ? null : dg0.b.valueOf(parcel.readString());
                long j11 = parcel.readLong();
                zf0.u uVar = (zf0.u) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                long j12 = parcel.readLong();
                float f11 = parcel.readFloat();
                dg0.a aVar = (dg0.a) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                x1 x1Var = (x1) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new CountdownToCapture(i11, bVarValueOf, j11, uVar, j12, f11, aVar, arrayList, x1Var, poseConfigsCreateFromParcel, z11, zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i11) {
                return new CountdownToCapture[i11];
            }
        }

        public /* synthetic */ CountdownToCapture(int i11, dg0.b bVar, long j11, zf0.u uVar, long j12, float f11, dg0.a aVar, List list, x1 x1Var, PoseConfigs poseConfigs, boolean z11, zf0.u.b bVar2, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : bVar, j11, uVar, j12, f11, aVar, list, x1Var, poseConfigs, z11, bVar2, z12);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return z.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return this.countDown == countdownToCapture.countDown && this.selfieError == countdownToCapture.selfieError && this.startCaptureTimestamp == countdownToCapture.startCaptureTimestamp && p013kotlin.jvm.internal.s.f(this.cameraProperties, countdownToCapture.cameraProperties) && this.startSelfieTimestamp == countdownToCapture.startSelfieTimestamp && Float.compare(this.poseScore, countdownToCapture.poseScore) == 0 && p013kotlin.jvm.internal.s.f(this.brightnessInfo, countdownToCapture.brightnessInfo) && p013kotlin.jvm.internal.s.f(this.posesNeeded, countdownToCapture.posesNeeded) && p013kotlin.jvm.internal.s.f(this.backState, countdownToCapture.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, countdownToCapture.poseConfigs) && this.autoCaptureSupported == countdownToCapture.autoCaptureSupported && this.cameraFacingMode == countdownToCapture.cameraFacingMode && this.isFlashEnabled == countdownToCapture.isFlashEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            dg0.b bVar = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            dg0.a aVar = this.brightnessInfo;
            int iHashCode3 = (((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31;
            x1 x1Var = this.backState;
            return ((((((((iHashCode3 + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return z.a.a(this);
        }

        @Override // th0.z
        public PoseConfig j() {
            return z.a.b(this);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final CountdownToCapture s(int countDown, dg0.b selfieError, long startCaptureTimestamp, zf0.u cameraProperties, long startSelfieTimestamp, float poseScore, dg0.a brightnessInfo, List<? extends a1.b> posesNeeded, x1 backState, PoseConfigs poseConfigs, boolean autoCaptureSupported, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new CountdownToCapture(countDown, selfieError, startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "CountdownToCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final dg0.a getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.countDown);
            dg0.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final dg0.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(int i11, dg0.b bVar, long j11, zf0.u cameraProperties, long j12, float f11, dg0.a aVar, List<? extends a1.b> posesNeeded, x1 x1Var, PoseConfigs poseConfigs, boolean z11, zf0.u.b cameraFacingMode, boolean z12) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.countDown = i11;
            this.selfieError = bVar;
            this.startCaptureTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j12;
            this.poseScore = f11;
            this.brightnessInfo = aVar;
            this.posesNeeded = posesNeeded;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z11;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    /* JADX INFO: renamed from: th0.x1$d, reason: from toString */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u0088\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b9\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b@\u0010GR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\b.\u0010?R&\u0010O\u001a\b\u0012\u0004\u0012\u00020K0\t8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bI\u00106\u0012\u0004\bM\u0010N\u001a\u0004\bL\u00108¨\u0006P"}, d2 = {"Lth0/x1$d;", "Lth0/x1;", "Lth0/a0;", "", "countDown", "Ldg0/b;", "selfieError", "Lzf0/u;", "cameraProperties", "", "Lth0/a1$b;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "backState", "Lth0/s0;", "poseConfigs", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ILdg0/b;Lzf0/u;Ljava/util/List;JZJLth0/x1;Lth0/s0;Lzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(ILdg0/b;Lzf0/u;Ljava/util/List;JZJLth0/x1;Lth0/s0;Lzf0/u$b;Z)Lth0/x1$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "v", "c", "Ldg0/b;", "w", "()Ldg0/b;", DateTokenConverter.CONVERTER_KEY, "Lzf0/u;", "()Lzf0/u;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "J", "k", "()J", "Z", "a", "()Z", "h", IntegerTokenConverter.CONVERTER_KEY, "Lth0/x1;", "l", "()Lth0/x1;", "j", "Lth0/s0;", "()Lth0/s0;", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "Lth0/a1;", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountdownToManualCapture extends x1 implements a0 {
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startCaptureTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToManualCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToManualCapture createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                boolean z13;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                dg0.b bVarValueOf = parcel.readInt() == 0 ? null : dg0.b.valueOf(parcel.readString());
                zf0.u uVar = (zf0.u) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                long j11 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z13 = true;
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = true;
                    z13 = false;
                }
                return new CountdownToManualCapture(i11, bVarValueOf, uVar, arrayList, j11, z13, parcel.readLong(), (x1) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z12 : z11);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToManualCapture[] newArray(int i11) {
                return new CountdownToManualCapture[i11];
            }
        }

        public /* synthetic */ CountdownToManualCapture(int i11, dg0.b bVar, zf0.u uVar, List list, long j11, boolean z11, long j12, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b bVar2, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : bVar, uVar, list, j11, (i12 & 32) != 0 ? true : z11, j12, x1Var, poseConfigs, bVar2, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CountdownToManualCapture u(CountdownToManualCapture countdownToManualCapture, int i11, dg0.b bVar, zf0.u uVar, List list, long j11, boolean z11, long j12, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b bVar2, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = countdownToManualCapture.countDown;
            }
            return countdownToManualCapture.s(i11, (i12 & 2) != 0 ? countdownToManualCapture.selfieError : bVar, (i12 & 4) != 0 ? countdownToManualCapture.cameraProperties : uVar, (i12 & 8) != 0 ? countdownToManualCapture.posesNeeded : list, (i12 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : j11, (i12 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : z11, (i12 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : j12, (i12 & 128) != 0 ? countdownToManualCapture.backState : x1Var, (i12 & 256) != 0 ? countdownToManualCapture.poseConfigs : poseConfigs, (i12 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : bVar2, (i12 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : z12);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return a0.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: d, reason: from getter */
        public zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // th0.a0
        public boolean e() {
            return a0.a.d(this);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToManualCapture)) {
                return false;
            }
            CountdownToManualCapture countdownToManualCapture = (CountdownToManualCapture) other;
            return this.countDown == countdownToManualCapture.countDown && this.selfieError == countdownToManualCapture.selfieError && p013kotlin.jvm.internal.s.f(this.cameraProperties, countdownToManualCapture.cameraProperties) && p013kotlin.jvm.internal.s.f(this.posesNeeded, countdownToManualCapture.posesNeeded) && this.startCaptureTimestamp == countdownToManualCapture.startCaptureTimestamp && this.autoCaptureSupported == countdownToManualCapture.autoCaptureSupported && this.startSelfieTimestamp == countdownToManualCapture.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.backState, countdownToManualCapture.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, countdownToManualCapture.poseConfigs) && this.cameraFacingMode == countdownToManualCapture.cameraFacingMode && this.isFlashEnabled == countdownToManualCapture.isFlashEnabled;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            dg0.b bVar = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            x1 x1Var = this.backState;
            return ((((((iHashCode2 + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return a0.a.a(this);
        }

        @Override // th0.z
        public PoseConfig j() {
            return a0.a.b(this);
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: k, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final CountdownToManualCapture s(int countDown, dg0.b selfieError, zf0.u cameraProperties, List<? extends a1.b> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, x1 backState, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new CountdownToManualCapture(countDown, selfieError, cameraProperties, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "CountdownToManualCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", cameraProperties=" + this.cameraProperties + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final dg0.b getSelfieError() {
            return this.selfieError;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.countDown);
            dg0.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToManualCapture(int i11, dg0.b bVar, zf0.u cameraProperties, List<? extends a1.b> posesNeeded, long j11, boolean z11, long j12, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean z12) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.countDown = i11;
            this.selfieError = bVar;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j11;
            this.autoCaptureSupported = z11;
            this.startSelfieTimestamp = j12;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    /* JADX INFO: renamed from: th0.x1$e, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u00105R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b3\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lth0/x1$e;", "Lth0/x1;", "", "Lth0/a1;", "selfies", "", "minDurationMs", "", "isDelayComplete", "isFinalizeComplete", "Lzf0/u;", "cameraProperties", "startSelfieTimestamp", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;JZZLzf0/u;JLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(Ljava/util/List;JZZLzf0/u;JLth0/x1;Lzf0/u$b;)Lth0/x1$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "J", "v", "()J", DateTokenConverter.CONVERTER_KEY, "Z", "w", "()Z", "e", "x", "f", "Lzf0/u;", "()Lzf0/u;", "g", "h", "Lth0/x1;", "l", "()Lth0/x1;", IntegerTokenConverter.CONVERTER_KEY, "Lzf0/u$b;", "m", "()Lzf0/u$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends x1 {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long minDurationMs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDelayComplete;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFinalizeComplete;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: th0.x1$e$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                long j11 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                return new FinalizeLocalVideoCapture(arrayList, j11, z12, parcel.readInt() != 0 ? z11 : false, (zf0.u) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i11) {
                return new FinalizeLocalVideoCapture[i11];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(List list, long j11, boolean z11, boolean z12, zf0.u uVar, long j12, x1 x1Var, zf0.u.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j11, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, uVar, j12, x1Var, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture u(FinalizeLocalVideoCapture finalizeLocalVideoCapture, List list, long j11, boolean z11, boolean z12, zf0.u uVar, long j12, x1 x1Var, zf0.u.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = finalizeLocalVideoCapture.selfies;
            }
            if ((i11 & 2) != 0) {
                j11 = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i11 & 4) != 0) {
                z11 = finalizeLocalVideoCapture.isDelayComplete;
            }
            if ((i11 & 8) != 0) {
                z12 = finalizeLocalVideoCapture.isFinalizeComplete;
            }
            if ((i11 & 16) != 0) {
                uVar = finalizeLocalVideoCapture.cameraProperties;
            }
            if ((i11 & 32) != 0) {
                j12 = finalizeLocalVideoCapture.startSelfieTimestamp;
            }
            if ((i11 & 64) != 0) {
                x1Var = finalizeLocalVideoCapture.backState;
            }
            if ((i11 & 128) != 0) {
                bVar = finalizeLocalVideoCapture.cameraFacingMode;
            }
            long j13 = j12;
            zf0.u uVar2 = uVar;
            boolean z13 = z11;
            return finalizeLocalVideoCapture.s(list, j11, z13, z12, uVar2, j13, x1Var, bVar);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return p013kotlin.jvm.internal.s.f(this.selfies, finalizeLocalVideoCapture.selfies) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete && this.isFinalizeComplete == finalizeLocalVideoCapture.isFinalizeComplete && p013kotlin.jvm.internal.s.f(this.cameraProperties, finalizeLocalVideoCapture.cameraProperties) && this.startSelfieTimestamp == finalizeLocalVideoCapture.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.backState, finalizeLocalVideoCapture.backState) && this.cameraFacingMode == finalizeLocalVideoCapture.cameraFacingMode;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selfies.hashCode() * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete)) * 31) + Boolean.hashCode(this.isFinalizeComplete)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            x1 x1Var = this.backState;
            return ((iHashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final FinalizeLocalVideoCapture s(List<? extends a1> selfies, long minDurationMs, boolean isDelayComplete, boolean isFinalizeComplete, zf0.u cameraProperties, long startSelfieTimestamp, x1 backState, zf0.u.b cameraFacingMode) {
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new FinalizeLocalVideoCapture(selfies, minDurationMs, isDelayComplete, isFinalizeComplete, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode);
        }

        public String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
            dest.writeInt(this.isFinalizeComplete ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getIsFinalizeComplete() {
            return this.isFinalizeComplete;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(List<? extends a1> selfies, long j11, boolean z11, boolean z12, zf0.u cameraProperties, long j12, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.minDurationMs = j11;
            this.isDelayComplete = z11;
            this.isFinalizeComplete = z12;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j12;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lth0/x1$f;", "Lth0/x1;", "", "Lth0/a1;", "selfies", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Lzf0/u;JLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "J", "f", "()J", "e", "Lth0/x1;", "l", "()Lth0/x1;", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends x1 {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(f.class.getClassLoader()));
                }
                return new f(arrayList, (zf0.u) parcel.readParcelable(f.class.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(f.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends a1> selfies, zf0.u cameraProperties, long j11, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lth0/x1$g;", "", "<init>", "(Ljava/lang/String;I)V", "Disabled", PeerConnectionFactory.TRIAL_ENABLED, "FlashOn", "ReadyToCapture", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum g {
        Disabled,
        Enabled,
        FlashOn,
        ReadyToCapture;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<g> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: th0.x1$h, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lth0/x1$h;", "Lth0/x1;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(ZZLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getHasRequestedCameraPermissions", "()Z", "c", "getHasRequestedAudioPermissions", DateTokenConverter.CONVERTER_KEY, "Lth0/x1;", "l", "()Lth0/x1;", "e", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "", "Lth0/a1;", "f", "Ljava/util/List;", "q", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestartCamera extends x1 {
        public static final Parcelable.Creator<RestartCamera> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$h$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartCamera> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestartCamera createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (x1) parcel.readParcelable(RestartCamera.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RestartCamera[] newArray(int i11) {
                return new RestartCamera[i11];
            }
        }

        public /* synthetic */ RestartCamera(boolean z11, boolean z12, x1 x1Var, zf0.u.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, x1Var, bVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestartCamera)) {
                return false;
            }
            RestartCamera restartCamera = (RestartCamera) other;
            return this.hasRequestedCameraPermissions == restartCamera.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == restartCamera.hasRequestedAudioPermissions && p013kotlin.jvm.internal.s.f(this.backState, restartCamera.backState) && this.cameraFacingMode == restartCamera.cameraFacingMode;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            x1 x1Var = this.backState;
            return ((iHashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public String toString() {
            return "RestartCamera(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RestartCamera(boolean z11, boolean z12, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z11;
            this.hasRequestedAudioPermissions = z12;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lth0/x1$i;", "Lth0/x1;", "", "Lth0/a1;", "selfies", "selfiesToReview", "", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lzf0/u;JLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "s", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "u", "()Ljava/lang/String;", "e", "Lzf0/u;", "()Lzf0/u;", "f", "J", "()J", "g", "Lth0/x1;", "l", "()Lth0/x1;", "h", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends x1 {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfiesToReview;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String webRtcObjectId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(i.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(i.class.getClassLoader()));
                }
                return new i(arrayList, arrayList2, parcel.readString(), (zf0.u) parcel.readParcelable(i.class.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(i.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i11) {
                return new i[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends a1> selfies, List<? extends a1> selfiesToReview, String str, zf0.u cameraProperties, long j11, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(selfiesToReview, "selfiesToReview");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.selfiesToReview = selfiesToReview;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final List<a1> s() {
            return this.selfiesToReview;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<a1> list2 = this.selfiesToReview;
            dest.writeInt(list2.size());
            Iterator<a1> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    /* JADX INFO: renamed from: th0.x1$k, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b/\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\b-\u00102¨\u0006D"}, d2 = {"Lth0/x1$k;", "Lth0/x1;", "Lth0/z;", "", "Lth0/a1;", "selfies", "Lth0/a1$b;", "posesNeeded", "", "autoCaptureSupported", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lth0/s0;", "poseConfigs", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;ZLzf0/u;JLth0/x1;Lth0/s0;Lzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(Ljava/util/List;Ljava/util/List;ZLzf0/u;JLth0/x1;Lth0/s0;Lzf0/u$b;Z)Lth0/x1$k;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "g", DateTokenConverter.CONVERTER_KEY, "Z", "a", "()Z", "e", "Lzf0/u;", "()Lzf0/u;", "f", "J", "()J", "Lth0/x1;", "l", "()Lth0/x1;", "h", "Lth0/s0;", "()Lth0/s0;", IntegerTokenConverter.CONVERTER_KEY, "Lzf0/u$b;", "m", "()Lzf0/u$b;", "j", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowPoseHint extends x1 implements z {
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: th0.x1$k$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowPoseHint> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowPoseHint createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(ShowPoseHint.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(a1.b.valueOf(parcel.readString()));
                }
                return new ShowPoseHint(arrayList, arrayList2, parcel.readInt() != 0, (zf0.u) parcel.readParcelable(r4.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(ShowPoseHint.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowPoseHint[] newArray(int i11) {
                return new ShowPoseHint[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowPoseHint(List<? extends a1> selfies, List<? extends a1.b> posesNeeded, boolean z11, zf0.u cameraProperties, long j11, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean z12) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.autoCaptureSupported = z11;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowPoseHint u(ShowPoseHint showPoseHint, List list, List list2, boolean z11, zf0.u uVar, long j11, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b bVar, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = showPoseHint.selfies;
            }
            if ((i11 & 2) != 0) {
                list2 = showPoseHint.posesNeeded;
            }
            if ((i11 & 4) != 0) {
                z11 = showPoseHint.autoCaptureSupported;
            }
            if ((i11 & 8) != 0) {
                uVar = showPoseHint.cameraProperties;
            }
            if ((i11 & 16) != 0) {
                j11 = showPoseHint.startSelfieTimestamp;
            }
            if ((i11 & 32) != 0) {
                x1Var = showPoseHint.backState;
            }
            if ((i11 & 64) != 0) {
                poseConfigs = showPoseHint.poseConfigs;
            }
            if ((i11 & 128) != 0) {
                bVar = showPoseHint.cameraFacingMode;
            }
            if ((i11 & 256) != 0) {
                z12 = showPoseHint.isFlashEnabled;
            }
            long j12 = j11;
            boolean z13 = z11;
            zf0.u uVar2 = uVar;
            return showPoseHint.s(list, list2, z13, uVar2, j12, x1Var, poseConfigs, bVar, z12);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return z.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPoseHint)) {
                return false;
            }
            ShowPoseHint showPoseHint = (ShowPoseHint) other;
            return p013kotlin.jvm.internal.s.f(this.selfies, showPoseHint.selfies) && p013kotlin.jvm.internal.s.f(this.posesNeeded, showPoseHint.posesNeeded) && this.autoCaptureSupported == showPoseHint.autoCaptureSupported && p013kotlin.jvm.internal.s.f(this.cameraProperties, showPoseHint.cameraProperties) && this.startSelfieTimestamp == showPoseHint.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.backState, showPoseHint.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, showPoseHint.poseConfigs) && this.cameraFacingMode == showPoseHint.cameraFacingMode && this.isFlashEnabled == showPoseHint.isFlashEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            x1 x1Var = this.backState;
            return ((((((iHashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return z.a.a(this);
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final ShowPoseHint s(List<? extends a1> selfies, List<? extends a1.b> posesNeeded, boolean autoCaptureSupported, zf0.u cameraProperties, long startSelfieTimestamp, x1 backState, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new ShowPoseHint(selfies, posesNeeded, autoCaptureSupported, cameraProperties, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "ShowPoseHint(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<a1.b> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<a1.b> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: th0.x1$m, reason: from toString */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b4\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b:\u0010;R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b?\u0010ER\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010G\u001a\u0004\b0\u0010IR&\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0\f8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bK\u0010=\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010>¨\u0006R"}, d2 = {"Lth0/x1$m;", "Lth0/x1;", "Lth0/z;", "", "startCaptureTimestamp", "Lzf0/u;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Ldg0/a;", "brightnessInfo", "", "Lth0/a1$b;", "posesNeeded", "backState", "Lth0/s0;", "poseConfigs", "", "autoCaptureSupported", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(JLzf0/u;JFLdg0/a;Ljava/util/List;Lth0/x1;Lth0/s0;ZLzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(JLzf0/u;JFLdg0/a;Ljava/util/List;Lth0/x1;Lth0/s0;ZLzf0/u$b;Z)Lth0/x1$m;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "k", "()J", "c", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "f", "e", Gender.FEMALE, "w", "()F", "Ldg0/a;", "v", "()Ldg0/a;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "Lth0/x1;", "l", "()Lth0/x1;", IntegerTokenConverter.CONVERTER_KEY, "Lth0/s0;", "()Lth0/s0;", "j", "Z", "a", "()Z", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "Lth0/a1;", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartCaptureFaceDetected extends x1 implements z {
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startCaptureTimestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float poseScore;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.a brightnessInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$m$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCaptureFaceDetected> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                long j11 = parcel.readLong();
                zf0.u uVar = (zf0.u) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                long j12 = parcel.readLong();
                float f11 = parcel.readFloat();
                dg0.a aVar = (dg0.a) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                x1 x1Var = (x1) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new StartCaptureFaceDetected(j11, uVar, j12, f11, aVar, arrayList, x1Var, poseConfigsCreateFromParcel, z11, zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected[] newArray(int i11) {
                return new StartCaptureFaceDetected[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureFaceDetected(long j11, zf0.u cameraProperties, long j12, float f11, dg0.a aVar, List<? extends a1.b> posesNeeded, x1 x1Var, PoseConfigs poseConfigs, boolean z11, zf0.u.b cameraFacingMode, boolean z12) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.startCaptureTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j12;
            this.poseScore = f11;
            this.brightnessInfo = aVar;
            this.posesNeeded = posesNeeded;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z11;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.selfies = p013kotlin.collections.v.m();
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return z.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCaptureFaceDetected)) {
                return false;
            }
            StartCaptureFaceDetected startCaptureFaceDetected = (StartCaptureFaceDetected) other;
            return this.startCaptureTimestamp == startCaptureFaceDetected.startCaptureTimestamp && p013kotlin.jvm.internal.s.f(this.cameraProperties, startCaptureFaceDetected.cameraProperties) && this.startSelfieTimestamp == startCaptureFaceDetected.startSelfieTimestamp && Float.compare(this.poseScore, startCaptureFaceDetected.poseScore) == 0 && p013kotlin.jvm.internal.s.f(this.brightnessInfo, startCaptureFaceDetected.brightnessInfo) && p013kotlin.jvm.internal.s.f(this.posesNeeded, startCaptureFaceDetected.posesNeeded) && p013kotlin.jvm.internal.s.f(this.backState, startCaptureFaceDetected.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, startCaptureFaceDetected.poseConfigs) && this.autoCaptureSupported == startCaptureFaceDetected.autoCaptureSupported && this.cameraFacingMode == startCaptureFaceDetected.cameraFacingMode && this.isFlashEnabled == startCaptureFaceDetected.isFlashEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = ((((((Long.hashCode(this.startCaptureTimestamp) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            dg0.a aVar = this.brightnessInfo;
            int iHashCode2 = (((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31;
            x1 x1Var = this.backState;
            return ((((((((iHashCode2 + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return z.a.a(this);
        }

        @Override // th0.z
        public PoseConfig j() {
            return z.a.b(this);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final StartCaptureFaceDetected s(long startCaptureTimestamp, zf0.u cameraProperties, long startSelfieTimestamp, float poseScore, dg0.a brightnessInfo, List<? extends a1.b> posesNeeded, x1 backState, PoseConfigs poseConfigs, boolean autoCaptureSupported, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new StartCaptureFaceDetected(startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "StartCaptureFaceDetected(startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final dg0.a getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lth0/x1$n;", "Lth0/x1;", "", "Lth0/a1;", "selfies", "", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzf0/u;JLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "Ljava/lang/String;", "s", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lzf0/u;", "()Lzf0/u;", "e", "J", "f", "()J", "Lth0/x1;", "l", "()Lth0/x1;", "g", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends x1 {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(n.class.getClassLoader()));
                }
                return new n(arrayList, parcel.readString(), (zf0.u) parcel.readParcelable(n.class.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(n.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i11) {
                return new n[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(List<? extends a1> selfies, String str, zf0.u cameraProperties, long j11, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    /* JADX INFO: renamed from: th0.x1$o, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b7\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b)\u0010(R&\u0010A\u001a\b\u0012\u0004\u0012\u00020<0\u00078\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b=\u00100\u0012\u0004\b?\u0010@\u001a\u0004\b>\u00102¨\u0006B"}, d2 = {"Lth0/x1$o;", "Lth0/x1;", "Lth0/z;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "", "Lth0/a1$b;", "posesNeeded", "Lth0/s0;", "poseConfigs", "autoCaptureSupported", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZZLth0/x1;Ljava/util/List;Lth0/s0;ZLzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(ZZLth0/x1;Ljava/util/List;Lth0/s0;ZLzf0/u$b;Z)Lth0/x1$o;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "w", "()Z", "c", "v", DateTokenConverter.CONVERTER_KEY, "Lth0/x1;", "l", "()Lth0/x1;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Lth0/s0;", "h", "()Lth0/s0;", "a", "Lzf0/u$b;", "m", "()Lzf0/u$b;", IntegerTokenConverter.CONVERTER_KEY, "Lth0/a1;", "j", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WaitForCameraFeed extends x1 implements z {
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$o$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForCameraFeed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                x1 x1Var = (x1) parcel.readParcelable(WaitForCameraFeed.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                return new WaitForCameraFeed(z11, z12, x1Var, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed[] newArray(int i11) {
                return new WaitForCameraFeed[i11];
            }
        }

        public /* synthetic */ WaitForCameraFeed(boolean z11, boolean z12, x1 x1Var, List list, PoseConfigs poseConfigs, boolean z13, zf0.u.b bVar, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, x1Var, list, poseConfigs, (i11 & 32) != 0 ? true : z13, bVar, (i11 & 128) != 0 ? false : z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForCameraFeed u(WaitForCameraFeed waitForCameraFeed, boolean z11, boolean z12, x1 x1Var, List list, PoseConfigs poseConfigs, boolean z13, zf0.u.b bVar, boolean z14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            if ((i11 & 2) != 0) {
                z12 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            if ((i11 & 4) != 0) {
                x1Var = waitForCameraFeed.backState;
            }
            if ((i11 & 8) != 0) {
                list = waitForCameraFeed.posesNeeded;
            }
            if ((i11 & 16) != 0) {
                poseConfigs = waitForCameraFeed.poseConfigs;
            }
            if ((i11 & 32) != 0) {
                z13 = waitForCameraFeed.autoCaptureSupported;
            }
            if ((i11 & 64) != 0) {
                bVar = waitForCameraFeed.cameraFacingMode;
            }
            if ((i11 & 128) != 0) {
                z14 = waitForCameraFeed.isFlashEnabled;
            }
            zf0.u.b bVar2 = bVar;
            boolean z15 = z14;
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z16 = z13;
            return waitForCameraFeed.s(z11, z12, x1Var, list, poseConfigs2, z16, bVar2, z15);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return z.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForCameraFeed)) {
                return false;
            }
            WaitForCameraFeed waitForCameraFeed = (WaitForCameraFeed) other;
            return this.hasRequestedCameraPermissions == waitForCameraFeed.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == waitForCameraFeed.hasRequestedAudioPermissions && p013kotlin.jvm.internal.s.f(this.backState, waitForCameraFeed.backState) && p013kotlin.jvm.internal.s.f(this.posesNeeded, waitForCameraFeed.posesNeeded) && p013kotlin.jvm.internal.s.f(this.poseConfigs, waitForCameraFeed.poseConfigs) && this.autoCaptureSupported == waitForCameraFeed.autoCaptureSupported && this.cameraFacingMode == waitForCameraFeed.cameraFacingMode && this.isFlashEnabled == waitForCameraFeed.isFlashEnabled;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            x1 x1Var = this.backState;
            return ((((((((((iHashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return z.a.a(this);
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final WaitForCameraFeed s(boolean hasRequestedCameraPermissions, boolean hasRequestedAudioPermissions, x1 backState, List<? extends a1.b> posesNeeded, PoseConfigs poseConfigs, boolean autoCaptureSupported, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new WaitForCameraFeed(hasRequestedCameraPermissions, hasRequestedAudioPermissions, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getHasRequestedAudioPermissions() {
            return this.hasRequestedAudioPermissions;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getHasRequestedCameraPermissions() {
            return this.hasRequestedCameraPermissions;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForCameraFeed(boolean z11, boolean z12, x1 x1Var, List<? extends a1.b> posesNeeded, PoseConfigs poseConfigs, boolean z13, zf0.u.b cameraFacingMode, boolean z14) {
            super(null);
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z11;
            this.hasRequestedAudioPermissions = z12;
            this.backState = x1Var;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z13;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z14;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    /* JADX INFO: renamed from: th0.x1$p, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\b+\u0010>R&\u0010I\u001a\b\u0012\u0004\u0012\u00020D0\n8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bE\u00106\u0012\u0004\bG\u0010H\u001a\u0004\bF\u00108¨\u0006J"}, d2 = {"Lth0/x1$p;", "Lth0/x1;", "Lth0/z;", "", "webRtcJwt", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "", "Lth0/a1$b;", "posesNeeded", "Lth0/s0;", "poseConfigs", "", "autoCaptureSupported", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/lang/String;Lzf0/u;JLth0/x1;Ljava/util/List;Lth0/s0;ZLzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(Ljava/lang/String;Lzf0/u;JLth0/x1;Ljava/util/List;Lth0/s0;ZLzf0/u$b;Z)Lth0/x1$p;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "v", "c", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "J", "f", "()J", "e", "Lth0/x1;", "l", "()Lth0/x1;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lth0/s0;", "h", "()Lth0/s0;", "Z", "a", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lzf0/u$b;", "m", "()Lzf0/u$b;", "j", "Lth0/a1;", "k", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WaitForWebRtcSetup extends x1 implements z {
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webRtcJwt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$p$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForWebRtcSetup> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                zf0.u uVar = (zf0.u) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                long j11 = parcel.readLong();
                x1 x1Var = (x1) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new WaitForWebRtcSetup(string, uVar, j11, x1Var, arrayList, poseConfigsCreateFromParcel, z11, zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup[] newArray(int i11) {
                return new WaitForWebRtcSetup[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForWebRtcSetup(String str, zf0.u cameraProperties, long j11, x1 x1Var, List<? extends a1.b> posesNeeded, PoseConfigs poseConfigs, boolean z11, zf0.u.b cameraFacingMode, boolean z12) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z11;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.selfies = p013kotlin.collections.v.m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForWebRtcSetup u(WaitForWebRtcSetup waitForWebRtcSetup, String str, zf0.u uVar, long j11, x1 x1Var, List list, PoseConfigs poseConfigs, boolean z11, zf0.u.b bVar, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = waitForWebRtcSetup.webRtcJwt;
            }
            if ((i11 & 2) != 0) {
                uVar = waitForWebRtcSetup.cameraProperties;
            }
            if ((i11 & 4) != 0) {
                j11 = waitForWebRtcSetup.startSelfieTimestamp;
            }
            if ((i11 & 8) != 0) {
                x1Var = waitForWebRtcSetup.backState;
            }
            if ((i11 & 16) != 0) {
                list = waitForWebRtcSetup.posesNeeded;
            }
            if ((i11 & 32) != 0) {
                poseConfigs = waitForWebRtcSetup.poseConfigs;
            }
            if ((i11 & 64) != 0) {
                z11 = waitForWebRtcSetup.autoCaptureSupported;
            }
            if ((i11 & 128) != 0) {
                bVar = waitForWebRtcSetup.cameraFacingMode;
            }
            if ((i11 & 256) != 0) {
                z12 = waitForWebRtcSetup.isFlashEnabled;
            }
            zf0.u.b bVar2 = bVar;
            boolean z13 = z12;
            long j12 = j11;
            return waitForWebRtcSetup.s(str, uVar, j12, x1Var, list, poseConfigs, z11, bVar2, z13);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return z.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForWebRtcSetup)) {
                return false;
            }
            WaitForWebRtcSetup waitForWebRtcSetup = (WaitForWebRtcSetup) other;
            return p013kotlin.jvm.internal.s.f(this.webRtcJwt, waitForWebRtcSetup.webRtcJwt) && p013kotlin.jvm.internal.s.f(this.cameraProperties, waitForWebRtcSetup.cameraProperties) && this.startSelfieTimestamp == waitForWebRtcSetup.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.backState, waitForWebRtcSetup.backState) && p013kotlin.jvm.internal.s.f(this.posesNeeded, waitForWebRtcSetup.posesNeeded) && p013kotlin.jvm.internal.s.f(this.poseConfigs, waitForWebRtcSetup.poseConfigs) && this.autoCaptureSupported == waitForWebRtcSetup.autoCaptureSupported && this.cameraFacingMode == waitForWebRtcSetup.cameraFacingMode && this.isFlashEnabled == waitForWebRtcSetup.isFlashEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            String str = this.webRtcJwt;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            x1 x1Var = this.backState;
            return ((((((((((iHashCode + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return z.a.a(this);
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final WaitForWebRtcSetup s(String webRtcJwt, zf0.u cameraProperties, long startSelfieTimestamp, x1 backState, List<? extends a1.b> posesNeeded, PoseConfigs poseConfigs, boolean autoCaptureSupported, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new WaitForWebRtcSetup(webRtcJwt, cameraProperties, startSelfieTimestamp, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lth0/x1$q;", "Lth0/x1;", "", "Lth0/a1;", "selfies", "", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzf0/u;JLth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "Ljava/lang/String;", "s", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lzf0/u;", "()Lzf0/u;", "e", "J", "f", "()J", "Lth0/x1;", "l", "()Lth0/x1;", "g", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends x1 {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(q.class.getClassLoader()));
                }
                return new q(arrayList, parcel.readString(), (zf0.u) parcel.readParcelable(q.class.getClassLoader()), parcel.readLong(), (x1) parcel.readParcelable(q.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i11) {
                return new q[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(List<? extends a1> selfies, String webRtcObjectId, zf0.u cameraProperties, long j11, x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(webRtcObjectId, "webRtcObjectId");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = webRtcObjectId;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    public /* synthetic */ x1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: l */
    public abstract x1 getBackState();

    /* JADX INFO: renamed from: m */
    public abstract zf0.u.b getCameraFacingMode();

    public abstract List<a1> q();

    public final void r(boolean z11) {
        this.didGoBack = z11;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lth0/x1$j;", "Lth0/x1;", "backState", "Lzf0/u$b;", "cameraFacingMode", "<init>", "(Lth0/x1;Lzf0/u$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Lth0/x1;", "l", "()Lth0/x1;", "c", "Lzf0/u$b;", "m", "()Lzf0/u$b;", "", "Lth0/a1;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "q", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends x1 {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final x1 backState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new j((x1) parcel.readParcelable(j.class.getClassLoader()), zf0.u.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i11) {
                return new j[i11];
            }
        }

        public /* synthetic */ j(x1 x1Var, zf0.u.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(x1Var, (i11 & 2) != 0 ? zf0.u.b.User : bVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(x1 x1Var, zf0.u.b cameraFacingMode) {
            super(null);
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.backState = x1Var;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    /* JADX INFO: renamed from: th0.x1$l, reason: from toString */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u009e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010-\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u00100\u001a\u0004\bG\u00102R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\b?\u0010ER\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b7\u0010KR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010O\u001a\u0004\bF\u0010PR\u001a\u0010\u0018\u001a\u00020\u00178\u0010X\u0090\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u00100\u001a\u0004\b3\u00102R&\u0010Z\u001a\b\u0012\u0004\u0012\u00020U0\u000b8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bV\u0010@\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u0010B¨\u0006["}, d2 = {"Lth0/x1$l;", "Lth0/x1;", "Lth0/a0;", "", "centered", "Ldg0/b;", "selfieError", "", "poseScore", "Ldg0/a;", "brightnessInfo", "", "Lth0/a1$b;", "posesNeeded", "", "startCaptureTimestamp", "autoCaptureSupported", "startSelfieTimestamp", "Lzf0/u;", "cameraProperties", "backState", "Lth0/s0;", "poseConfigs", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZLdg0/b;FLdg0/a;Ljava/util/List;JZJLzf0/u;Lth0/x1;Lth0/s0;Lzf0/u$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(ZLdg0/b;FLdg0/a;Ljava/util/List;JZJLzf0/u;Lth0/x1;Lth0/s0;Lzf0/u$b;Z)Lth0/x1$l;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getCentered", "()Z", "c", "Ldg0/b;", "x", "()Ldg0/b;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "w", "()F", "e", "Ldg0/a;", "v", "()Ldg0/a;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "J", "k", "()J", "h", "a", IntegerTokenConverter.CONVERTER_KEY, "j", "Lzf0/u;", "()Lzf0/u;", "Lth0/x1;", "l", "()Lth0/x1;", "Lth0/s0;", "()Lth0/s0;", "m", "Lzf0/u$b;", "()Lzf0/u$b;", "n", "Lth0/a1;", "o", "q", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartCapture extends x1 implements a0 {
        public static final Parcelable.Creator<StartCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean centered;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float poseScore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.a brightnessInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startCaptureTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: th0.x1$l$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCapture createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                dg0.b bVarValueOf = parcel.readInt() == 0 ? null : dg0.b.valueOf(parcel.readString());
                float f11 = parcel.readFloat();
                dg0.a aVar = (dg0.a) parcel.readParcelable(StartCapture.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(a1.b.valueOf(parcel.readString()));
                }
                return new StartCapture(z11, bVarValueOf, f11, aVar, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (zf0.u) parcel.readParcelable(StartCapture.class.getClassLoader()), (x1) parcel.readParcelable(StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCapture[] newArray(int i11) {
                return new StartCapture[i11];
            }
        }

        public /* synthetic */ StartCapture(boolean z11, dg0.b bVar, float f11, dg0.a aVar, List list, long j11, boolean z12, long j12, zf0.u uVar, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b bVar2, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? dg0.b.FaceNotCentered : bVar, f11, aVar, list, j11, (i11 & 64) != 0 ? true : z12, j12, uVar, x1Var, poseConfigs, bVar2, z13);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return a0.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: d, reason: from getter */
        public zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // th0.a0
        public boolean e() {
            return a0.a.d(this);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCapture)) {
                return false;
            }
            StartCapture startCapture = (StartCapture) other;
            return this.centered == startCapture.centered && this.selfieError == startCapture.selfieError && Float.compare(this.poseScore, startCapture.poseScore) == 0 && p013kotlin.jvm.internal.s.f(this.brightnessInfo, startCapture.brightnessInfo) && p013kotlin.jvm.internal.s.f(this.posesNeeded, startCapture.posesNeeded) && this.startCaptureTimestamp == startCapture.startCaptureTimestamp && this.autoCaptureSupported == startCapture.autoCaptureSupported && this.startSelfieTimestamp == startCapture.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.cameraProperties, startCapture.cameraProperties) && p013kotlin.jvm.internal.s.f(this.backState, startCapture.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, startCapture.poseConfigs) && this.cameraFacingMode == startCapture.cameraFacingMode && this.isFlashEnabled == startCapture.isFlashEnabled;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.centered) * 31;
            dg0.b bVar = this.selfieError;
            int iHashCode2 = (((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Float.hashCode(this.poseScore)) * 31;
            dg0.a aVar = this.brightnessInfo;
            int iHashCode3 = (((((((((((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            x1 x1Var = this.backState;
            return ((((((iHashCode3 + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // th0.z
        public a1.b i() {
            return a0.a.a(this);
        }

        @Override // th0.z
        public PoseConfig j() {
            return a0.a.b(this);
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: k, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final StartCapture s(boolean centered, dg0.b selfieError, float poseScore, dg0.a brightnessInfo, List<? extends a1.b> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, zf0.u cameraProperties, x1 backState, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean isFlashEnabled) {
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            return new StartCapture(centered, selfieError, poseScore, brightnessInfo, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        public String toString() {
            return "StartCapture(centered=" + this.centered + ", selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final dg0.a getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.centered ? 1 : 0);
            dg0.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<a1.b> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<a1.b> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final dg0.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCapture(boolean z11, dg0.b bVar, float f11, dg0.a aVar, List<? extends a1.b> posesNeeded, long j11, boolean z12, long j12, zf0.u cameraProperties, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            this.centered = z11;
            this.selfieError = bVar;
            this.poseScore = f11;
            this.brightnessInfo = aVar;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j11;
            this.autoCaptureSupported = z12;
            this.startSelfieTimestamp = j12;
            this.cameraProperties = cameraProperties;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z13;
            this.selfies = p013kotlin.collections.v.m();
        }
    }

    private x1() {
    }

    /* JADX INFO: renamed from: th0.x1$a, reason: from toString */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J®\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010'J\u001a\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bB\u0010FR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b:\u0010NR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bE\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010R\u001a\u0004\bG\u0010SR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010VR\u001a\u0010\u001a\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010H\u001a\u0004\b6\u0010JR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lth0/x1$a;", "Lth0/x1;", "Lth0/a0;", "Ldg0/b;", "selfieError", "", "poseScore", "Ldg0/a;", "brightnessInfo", "", "Lth0/a1;", "selfies", "Lth0/a1$b;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "Lzf0/u;", "cameraProperties", "backState", "Lth0/s0;", "poseConfigs", "Lzf0/u$b;", "cameraFacingMode", "isFlashEnabled", "Lth0/x1$g;", "flashState", "<init>", "(Ldg0/b;FLdg0/a;Ljava/util/List;Ljava/util/List;JZJLzf0/u;Lth0/x1;Lth0/s0;Lzf0/u$b;ZLth0/x1$g;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "(Ldg0/b;FLdg0/a;Ljava/util/List;Ljava/util/List;JZJLzf0/u;Lth0/x1;Lth0/s0;Lzf0/u$b;ZLth0/x1$g;)Lth0/x1$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ldg0/b;", "y", "()Ldg0/b;", "c", Gender.FEMALE, "x", "()F", DateTokenConverter.CONVERTER_KEY, "Ldg0/a;", "v", "()Ldg0/a;", "e", "Ljava/util/List;", "q", "()Ljava/util/List;", "f", "g", "J", "k", "()J", "h", "Z", "a", "()Z", IntegerTokenConverter.CONVERTER_KEY, "j", "Lzf0/u;", "()Lzf0/u;", "Lth0/x1;", "l", "()Lth0/x1;", "Lth0/s0;", "()Lth0/s0;", "m", "Lzf0/u$b;", "()Lzf0/u$b;", "n", "o", "Lth0/x1$g;", "w", "()Lth0/x1$g;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Capture extends x1 implements a0 {
        public static final Parcelable.Creator<Capture> CREATOR = new C2438a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.b selfieError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float poseScore;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final dg0.a brightnessInfo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1> selfies;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startCaptureTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startSelfieTimestamp;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final x1 backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u.b cameraFacingMode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final g flashState;

        /* JADX INFO: renamed from: th0.x1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2438a implements Parcelable.Creator<Capture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Capture createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                boolean z13;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                dg0.b bVarValueOf = parcel.readInt() == 0 ? null : dg0.b.valueOf(parcel.readString());
                float f11 = parcel.readFloat();
                dg0.a aVar = (dg0.a) parcel.readParcelable(Capture.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(Capture.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(a1.b.valueOf(parcel.readString()));
                }
                long j11 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z13 = true;
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = true;
                    z13 = false;
                }
                return new Capture(bVarValueOf, f11, aVar, arrayList, arrayList2, j11, z13, parcel.readLong(), (zf0.u) parcel.readParcelable(Capture.class.getClassLoader()), (x1) parcel.readParcelable(Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), zf0.u.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z12 : z11, g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Capture[] newArray(int i11) {
                return new Capture[i11];
            }
        }

        public /* synthetic */ Capture(dg0.b bVar, float f11, dg0.a aVar, List list, List list2, long j11, boolean z11, long j12, zf0.u uVar, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b bVar2, boolean z12, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bVar, f11, aVar, (i11 & 8) != 0 ? p013kotlin.collections.v.m() : list, list2, j11, (i11 & 64) != 0 ? true : z11, j12, uVar, x1Var, poseConfigs, bVar2, z12, (i11 & PKIFailureInfo.certRevoked) != 0 ? g.Disabled : gVar);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // th0.z
        public a1.b b() {
            return a0.a.c(this);
        }

        @Override // th0.z
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: d, reason: from getter */
        public zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // th0.a0
        public boolean e() {
            return a0.a.d(this);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) other;
            return this.selfieError == capture.selfieError && Float.compare(this.poseScore, capture.poseScore) == 0 && p013kotlin.jvm.internal.s.f(this.brightnessInfo, capture.brightnessInfo) && p013kotlin.jvm.internal.s.f(this.selfies, capture.selfies) && p013kotlin.jvm.internal.s.f(this.posesNeeded, capture.posesNeeded) && this.startCaptureTimestamp == capture.startCaptureTimestamp && this.autoCaptureSupported == capture.autoCaptureSupported && this.startSelfieTimestamp == capture.startSelfieTimestamp && p013kotlin.jvm.internal.s.f(this.cameraProperties, capture.cameraProperties) && p013kotlin.jvm.internal.s.f(this.backState, capture.backState) && p013kotlin.jvm.internal.s.f(this.poseConfigs, capture.poseConfigs) && this.cameraFacingMode == capture.cameraFacingMode && this.isFlashEnabled == capture.isFlashEnabled && this.flashState == capture.flashState;
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // th0.z
        public List<a1.b> g() {
            return this.posesNeeded;
        }

        @Override // th0.z
        /* JADX INFO: renamed from: h, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public int hashCode() {
            dg0.b bVar = this.selfieError;
            int iHashCode = (((bVar == null ? 0 : bVar.hashCode()) * 31) + Float.hashCode(this.poseScore)) * 31;
            dg0.a aVar = this.brightnessInfo;
            int iHashCode2 = (((((((((((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.selfies.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            x1 x1Var = this.backState;
            return ((((((((iHashCode2 + (x1Var != null ? x1Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.flashState.hashCode();
        }

        @Override // th0.z
        public a1.b i() {
            return a0.a.a(this);
        }

        @Override // th0.z
        public PoseConfig j() {
            return a0.a.b(this);
        }

        @Override // th0.a0
        /* JADX INFO: renamed from: k, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: l, reason: from getter */
        public x1 getBackState() {
            return this.backState;
        }

        @Override // th0.x1
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // th0.x1
        public List<a1> q() {
            return this.selfies;
        }

        public final Capture s(dg0.b selfieError, float poseScore, dg0.a brightnessInfo, List<? extends a1> selfies, List<? extends a1.b> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, zf0.u cameraProperties, x1 backState, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean isFlashEnabled, g flashState) {
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            p013kotlin.jvm.internal.s.k(flashState, "flashState");
            return new Capture(selfieError, poseScore, brightnessInfo, selfies, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled, flashState);
        }

        public String toString() {
            return "Capture(selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", flashState=" + this.flashState + ")";
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final dg0.a getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final g getFlashState() {
            return this.flashState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dg0.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<a1> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<a1> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<a1.b> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<a1.b> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeString(this.flashState.name());
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final dg0.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Capture(dg0.b bVar, float f11, dg0.a aVar, List<? extends a1> selfies, List<? extends a1.b> posesNeeded, long j11, boolean z11, long j12, zf0.u cameraProperties, x1 x1Var, PoseConfigs poseConfigs, zf0.u.b cameraFacingMode, boolean z12, g flashState) {
            super(null);
            p013kotlin.jvm.internal.s.k(selfies, "selfies");
            p013kotlin.jvm.internal.s.k(posesNeeded, "posesNeeded");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(cameraFacingMode, "cameraFacingMode");
            p013kotlin.jvm.internal.s.k(flashState, "flashState");
            this.selfieError = bVar;
            this.poseScore = f11;
            this.brightnessInfo = aVar;
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j11;
            this.autoCaptureSupported = z11;
            this.startSelfieTimestamp = j12;
            this.cameraProperties = cameraProperties;
            this.backState = x1Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.flashState = flashState;
        }
    }
}
