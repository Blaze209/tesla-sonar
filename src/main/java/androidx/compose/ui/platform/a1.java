package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import i4.SpanStyle;
import k3.Shadow;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import t4.TextGeometricTransform;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0013\u0010&\u001a\u00020%ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001aJ\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0017J\u0013\u0010-\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0017R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/platform/a1;", "", "", InquiryField.StringField.TYPE, "<init>", "(Ljava/lang/String;)V", "Lt4/a;", "b", "()F", "Lt4/o;", "n", "()Lt4/o;", "Lt4/k;", "m", "()Lt4/k;", "Lk3/e4;", "j", "()Lk3/e4;", "", "c", "()B", "", IntegerTokenConverter.CONVERTER_KEY, "()I", "Ljn0/c0;", "p", "()J", "", "e", "l", "()Ljava/lang/String;", "a", "Li4/d0;", "k", "()Li4/d0;", "Lk3/p1;", DateTokenConverter.CONVERTER_KEY, "Lw4/v;", "o", "Ln4/f0;", "h", "()Ln4/f0;", "Ln4/b0;", "f", "Ln4/c0;", "g", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Parcel parcel;

    public a1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.parcel.dataAvail();
    }

    private final float b() {
        return t4.a.c(e());
    }

    private final byte c() {
        return this.parcel.readByte();
    }

    private final float e() {
        return this.parcel.readFloat();
    }

    private final int i() {
        return this.parcel.readInt();
    }

    private final Shadow j() {
        return new Shadow(d(), j3.h.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.parcel.readString();
    }

    private final t4.k m() {
        int i11 = i();
        t4.k.Companion companion = t4.k.INSTANCE;
        boolean z11 = (companion.b().getMask() & i11) != 0;
        boolean z12 = (i11 & companion.d().getMask()) != 0;
        if (z11 && z12) {
            return companion.a(p013kotlin.collections.v.p(companion.b(), companion.d()));
        }
        if (z11) {
            return companion.b();
        }
        return z12 ? companion.d() : companion.c();
    }

    private final TextGeometricTransform n() {
        return new TextGeometricTransform(e(), e());
    }

    private final long p() {
        return jn0.c0.b(this.parcel.readLong());
    }

    public final long d() {
        return k3.p1.m(p());
    }

    public final int f() {
        byte bC = c();
        if (bC == 0) {
            return p014n4.b0.INSTANCE.b();
        }
        return bC == 1 ? p014n4.b0.INSTANCE.a() : p014n4.b0.INSTANCE.b();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return p014n4.c0.INSTANCE.b();
        }
        if (bC == 1) {
            return p014n4.c0.INSTANCE.a();
        }
        if (bC == 3) {
            return p014n4.c0.INSTANCE.c();
        }
        return bC == 2 ? p014n4.c0.INSTANCE.d() : p014n4.c0.INSTANCE.b();
    }

    public final FontWeight h() {
        return new FontWeight(i());
    }

    public final SpanStyle k() {
        x1 x1Var = new x1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            x1Var.j(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        x1Var.k(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    x1Var.a(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                x1Var.l(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            x1Var.b(t4.a.b(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        x1Var.i(o());
                                    }
                                } else {
                                    x1Var.d(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                x1Var.g(p014n4.c0.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            x1Var.f(p014n4.b0.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        x1Var.h(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    x1Var.e(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                x1Var.c(d());
            }
        }
        return x1Var.m();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = w4.x.INSTANCE.b();
        } else {
            jA = bC == 2 ? w4.x.INSTANCE.a() : w4.x.INSTANCE.c();
        }
        return w4.x.g(jA, w4.x.INSTANCE.c()) ? w4.v.INSTANCE.a() : w4.w.a(e(), jA);
    }
}
