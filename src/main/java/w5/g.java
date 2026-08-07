package w5;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f120827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f120828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f120829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<k> f120830g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f120832i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120824a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f120825b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120826c = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f120831h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f120833j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f120834k = false;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            g gVar = new g();
            gVar.b(parcel);
            return gVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i11) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                parcel.writeTypedObject(list.get(i12), i11);
            }
        }
    }

    private int a(Object obj) {
        int iA = 0;
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Collection)) {
            if (obj instanceof Parcelable) {
                return ((Parcelable) obj).describeContents();
            }
            return 0;
        }
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            iA |= a(it.next());
        }
        return iA;
    }

    public final void b(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i11 = parcel.readInt();
        try {
            if (i11 < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition < i11) {
                this.f120824a = parcel.readInt();
                if (parcel.dataPosition() - iDataPosition < i11) {
                    this.f120825b = parcel.readInt();
                    if (parcel.dataPosition() - iDataPosition < i11) {
                        this.f120826c = parcel.readInt();
                        if (parcel.dataPosition() - iDataPosition < i11) {
                            this.f120827d = parcel.createByteArray();
                            if (parcel.dataPosition() - iDataPosition < i11) {
                                this.f120828e = parcel.createByteArray();
                                if (parcel.dataPosition() - iDataPosition < i11) {
                                    this.f120829f = (j) parcel.readTypedObject(j.CREATOR);
                                    if (parcel.dataPosition() - iDataPosition < i11) {
                                        this.f120830g = parcel.createTypedArrayList(k.CREATOR);
                                        if (parcel.dataPosition() - iDataPosition < i11) {
                                            this.f120831h = parcel.readInt();
                                            if (parcel.dataPosition() - iDataPosition < i11) {
                                                this.f120832i = (l) parcel.readTypedObject(l.CREATOR);
                                                if (parcel.dataPosition() - iDataPosition < i11) {
                                                    this.f120833j = parcel.readInt();
                                                    if (parcel.dataPosition() - iDataPosition < i11) {
                                                        this.f120834k = parcel.readInt() != 0;
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
        return a(this.f120829f) | a(this.f120830g) | a(this.f120832i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.f120824a);
        parcel.writeInt(this.f120825b);
        parcel.writeInt(this.f120826c);
        parcel.writeByteArray(this.f120827d);
        parcel.writeByteArray(this.f120828e);
        parcel.writeTypedObject(this.f120829f, i11);
        b.b(parcel, this.f120830g, i11);
        parcel.writeInt(this.f120831h);
        parcel.writeTypedObject(this.f120832i, i11);
        parcel.writeInt(this.f120833j);
        parcel.writeInt(this.f120834k ? 1 : 0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
