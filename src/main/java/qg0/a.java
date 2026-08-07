package qg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import pg0.IdConfig;
import pg0.g5;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lqg0/a;", "Landroid/os/Parcelable;", "", "isEnabled", "extractTextFromImage", "Lpg0/d4$c;", "idSideConfig", "<init>", "(ZZLpg0/d4$c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Z", "c", "()Z", "b", "Lpg0/d4$c;", "()Lpg0/d4$c;", DateTokenConverter.CONVERTER_KEY, "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean extractTextFromImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IdConfig.IdSideConfig idSideConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: qg0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqg0/a$a;", "", "<init>", "()V", "Lpg0/d4$c;", "a", "()Lpg0/d4$c;", "", "isEnabled", "extractTextFromImage", "idSideConfig", "Lqg0/a;", "b", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lpg0/d4$c;)Lqg0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IdConfig.IdSideConfig a() {
            return new IdConfig.IdSideConfig("unknown", IdConfig.e.Front, g5.d.b.f102494a, new IdConfig.AutoCaptureConfig(null, 1, null), new IdConfig.ManualCaptureConfig(true, 0L));
        }

        public final a b(Boolean isEnabled, Boolean extractTextFromImage, IdConfig.IdSideConfig idSideConfig) {
            boolean zBooleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
            boolean zBooleanValue2 = extractTextFromImage != null ? extractTextFromImage.booleanValue() : true;
            if (idSideConfig == null) {
                idSideConfig = a();
            }
            return new a(zBooleanValue, zBooleanValue2, idSideConfig);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new a(parcel.readInt() != 0, parcel.readInt() != 0, IdConfig.IdSideConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(boolean z11, boolean z12, IdConfig.IdSideConfig idSideConfig) {
        p013kotlin.jvm.internal.s.k(idSideConfig, "idSideConfig");
        this.isEnabled = z11;
        this.extractTextFromImage = z12;
        this.idSideConfig = idSideConfig;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getExtractTextFromImage() {
        return this.extractTextFromImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IdConfig.IdSideConfig getIdSideConfig() {
        return this.idSideConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.extractTextFromImage ? 1 : 0);
        this.idSideConfig.writeToParcel(dest, flags);
    }
}
