package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class a extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f14298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f14299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14305k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f14299e.writeInt(-1);
        } else {
            this.f14299e.writeInt(bArr.length);
            this.f14299e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f14299e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i11) {
        this.f14299e.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f14299e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f14299e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i11 = this.f14303i;
        if (i11 >= 0) {
            int i12 = this.f14298d.get(i11);
            int iDataPosition = this.f14299e.dataPosition();
            this.f14299e.setDataPosition(i12);
            this.f14299e.writeInt(iDataPosition - i12);
            this.f14299e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f14299e;
        int iDataPosition = parcel.dataPosition();
        int i11 = this.f14304j;
        if (i11 == this.f14300f) {
            i11 = this.f14301g;
        }
        return new a(parcel, iDataPosition, i11, this.f14302h + "  ", this.f14295a, this.f14296b, this.f14297c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f14299e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i11 = this.f14299e.readInt();
        if (i11 < 0) {
            return null;
        }
        byte[] bArr = new byte[i11];
        this.f14299e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f14299e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i11) {
        while (this.f14304j < this.f14301g) {
            int i12 = this.f14305k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.f14299e.setDataPosition(this.f14304j);
            int i13 = this.f14299e.readInt();
            this.f14305k = this.f14299e.readInt();
            this.f14304j += i13;
        }
        return this.f14305k == i11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f14299e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f14299e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f14299e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i11) {
        a();
        this.f14303i = i11;
        this.f14298d.put(i11, this.f14299e.dataPosition());
        E(0);
        E(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z11) {
        this.f14299e.writeInt(z11 ? 1 : 0);
    }

    private a(Parcel parcel, int i11, int i12, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f14298d = new SparseIntArray();
        this.f14303i = -1;
        this.f14305k = -1;
        this.f14299e = parcel;
        this.f14300f = i11;
        this.f14301g = i12;
        this.f14304j = i11;
        this.f14302h = str;
    }
}
