package w5;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f120815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f120816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f120817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f120818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f120819i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f120811a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f120812b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f120813c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120814d = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f120820j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f120821k = false;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            e eVar = new e();
            eVar.a(parcel);
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public final void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i11 = parcel.readInt();
        try {
            if (i11 < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition < i11) {
                this.f120811a = parcel.readInt() != 0;
                if (parcel.dataPosition() - iDataPosition < i11) {
                    this.f120812b = parcel.readInt() != 0;
                    if (parcel.dataPosition() - iDataPosition < i11) {
                        this.f120813c = parcel.readInt() != 0;
                        if (parcel.dataPosition() - iDataPosition < i11) {
                            this.f120814d = parcel.readInt();
                            if (parcel.dataPosition() - iDataPosition < i11) {
                                this.f120815e = parcel.createIntArray();
                                if (parcel.dataPosition() - iDataPosition < i11) {
                                    this.f120816f = parcel.createIntArray();
                                    if (parcel.dataPosition() - iDataPosition < i11) {
                                        this.f120817g = parcel.createIntArray();
                                        if (parcel.dataPosition() - iDataPosition < i11) {
                                            this.f120818h = parcel.createIntArray();
                                            if (parcel.dataPosition() - iDataPosition < i11) {
                                                this.f120819i = parcel.createIntArray();
                                                if (parcel.dataPosition() - iDataPosition < i11) {
                                                    this.f120820j = parcel.readInt() != 0;
                                                    if (parcel.dataPosition() - iDataPosition < i11) {
                                                        this.f120821k = parcel.readInt() != 0;
                                                        if (iDataPosition > Integer.MAX_VALUE - i11) {
                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                        }
                                                    } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i11);
        } catch (Throwable th2) {
            if (iDataPosition > Integer.MAX_VALUE - i11) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i11);
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.f120811a ? 1 : 0);
        parcel.writeInt(this.f120812b ? 1 : 0);
        parcel.writeInt(this.f120813c ? 1 : 0);
        parcel.writeInt(this.f120814d);
        parcel.writeIntArray(this.f120815e);
        parcel.writeIntArray(this.f120816f);
        parcel.writeIntArray(this.f120817g);
        parcel.writeIntArray(this.f120818h);
        parcel.writeIntArray(this.f120819i);
        parcel.writeInt(this.f120820j ? 1 : 0);
        parcel.writeInt(this.f120821k ? 1 : 0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
