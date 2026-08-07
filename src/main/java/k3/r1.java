package k3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u000b*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "red", "green", "blue", "alpha", "Ll3/c;", "colorSpace", "Lk3/p1;", "a", "(FFFFLl3/c;)J", "g", "", "color", "b", "(I)J", "", DateTokenConverter.CONVERTER_KEY, "(J)J", "c", "(IIII)J", "start", "stop", "fraction", IntegerTokenConverter.CONVERTER_KEY, "(JJF)J", AppStateModule.APP_STATE_BACKGROUND, "h", "(JJ)J", "j", "(J)F", "k", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r1 {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public static final long a(float f11, float f12, float f13, float f14, l3.c cVar) {
        int i11;
        int i12;
        int i13;
        float f15;
        float fE;
        int iFloatToRawIntBits;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        float f16;
        float fE2;
        int iFloatToRawIntBits2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        boolean zI = cVar.getIsSrgb();
        float f17 = BitmapDescriptorFactory.HUE_RED;
        if (zI) {
            float f18 = f14 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f14;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            int i32 = ((int) ((f18 * 255.0f) + 0.5f)) << 24;
            float f19 = f11 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f11;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            int i33 = i32 | (((int) ((f19 * 255.0f) + 0.5f)) << 16);
            float f21 = f12 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f12;
            if (f21 > 1.0f) {
                f21 = 1.0f;
            }
            int i34 = i33 | (((int) ((f21 * 255.0f) + 0.5f)) << 8);
            if (f13 >= BitmapDescriptorFactory.HUE_RED) {
                f17 = f13;
            }
            return p1.m(jn0.c0.b(jn0.c0.b(i34 | ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        int i35 = 0;
        if (!(cVar.c() == 3)) {
            l3.a("Color only works with ColorSpaces with 3 components");
        }
        int iD = cVar.getId();
        if (!(iD != -1)) {
            l3.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float f22 = cVar.f(0);
        float fE3 = cVar.e(0);
        if (f11 >= f22) {
            f22 = f11;
        }
        if (f22 <= fE3) {
            fE3 = f22;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fE3);
        int i36 = iFloatToRawIntBits3 >>> 31;
        int i37 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i38 = iFloatToRawIntBits3 & 8388607;
        if (i37 == 255) {
            i12 = i38 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i37 - 112;
            if (i11 >= 31) {
                i12 = 0;
                i11 = 49;
            } else {
                if (i11 > 0) {
                    int i39 = i38 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i13 = (((i11 << 10) | i39) + 1) | (i36 << 15);
                    } else {
                        i12 = i39;
                    }
                    short s11 = (short) i13;
                    f15 = cVar.f(1);
                    fE = cVar.e(1);
                    if (f12 >= f15) {
                        f15 = f12;
                    }
                    if (f15 <= fE) {
                        fE = f15;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fE);
                    i14 = iFloatToRawIntBits >>> 31;
                    i15 = (iFloatToRawIntBits >>> 23) & 255;
                    i16 = iFloatToRawIntBits & 8388607;
                    if (i15 == 255) {
                        if (i16 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i17 = 31;
                    } else {
                        i17 = i15 - 112;
                        if (i17 >= 31) {
                            i19 = 0;
                            i17 = 49;
                        } else {
                            if (i17 <= 0) {
                                i18 = i16 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                                } else {
                                    i19 = i18;
                                }
                                short s12 = (short) i21;
                                f16 = cVar.f(2);
                                fE2 = cVar.e(2);
                                if (f13 >= f16) {
                                    f16 = f13;
                                }
                                if (f16 <= fE2) {
                                    fE2 = f16;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                                i23 = iFloatToRawIntBits2 >>> 31;
                                i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i25 = 8388607 & iFloatToRawIntBits2;
                                if (i24 == 255) {
                                    i28 = i25 != 0 ? 512 : 0;
                                    i35 = 31;
                                } else {
                                    i26 = i24 - 112;
                                    if (i26 >= 31) {
                                        i28 = 0;
                                        i35 = 49;
                                    } else {
                                        if (i26 <= 0) {
                                            i27 = i25 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                            } else {
                                                i28 = i27;
                                                i35 = i26;
                                            }
                                            short s13 = (short) i29;
                                            if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                                f17 = f14;
                                            }
                                            return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s13)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        if (i26 >= -10) {
                                            i31 = (i25 | 8388608) >> (1 - i26);
                                            if ((i31 & 4096) != 0) {
                                                i31 += PKIFailureInfo.certRevoked;
                                            }
                                            i28 = i31 >> 13;
                                        } else {
                                            i28 = 0;
                                        }
                                    }
                                }
                                i29 = i28 | (i23 << 15) | (i35 << 10);
                                short s14 = (short) i29;
                                if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                    f17 = f14;
                                }
                                return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s14)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i17 >= -10) {
                                i22 = (i16 | 8388608) >> (1 - i17);
                                if ((i22 & 4096) != 0) {
                                    i22 += PKIFailureInfo.certRevoked;
                                }
                                i19 = i22 >> 13;
                                i17 = 0;
                            } else {
                                i19 = 0;
                                i17 = 0;
                            }
                        }
                    }
                    i21 = i19 | (i14 << 15) | (i17 << 10);
                    short s15 = (short) i21;
                    f16 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f13 >= f16) {
                        f16 = f13;
                    }
                    if (f16 <= fE2) {
                        fE2 = f16;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i28 = i25 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i26 = i24 - 112;
                        if (i26 >= 31) {
                            i28 = 0;
                            i35 = 49;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                } else {
                                    i28 = i27;
                                    i35 = i26;
                                }
                                short s16 = (short) i29;
                                if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                    f17 = f14;
                                }
                                return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s16)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i26 >= -10) {
                                i31 = (i25 | 8388608) >> (1 - i26);
                                if ((i31 & 4096) != 0) {
                                    i31 += PKIFailureInfo.certRevoked;
                                }
                                i28 = i31 >> 13;
                            } else {
                                i28 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i23 << 15) | (i35 << 10);
                    short s17 = (short) i29;
                    if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                        f17 = f14;
                    }
                    return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s17)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i11 >= -10) {
                    int i41 = (i38 | 8388608) >> (1 - i11);
                    if ((i41 & 4096) != 0) {
                        i41 += PKIFailureInfo.certRevoked;
                    }
                    i12 = i41 >> 13;
                    i11 = 0;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
            }
        }
        i13 = i12 | (i36 << 15) | (i11 << 10);
        short s18 = (short) i13;
        f15 = cVar.f(1);
        fE = cVar.e(1);
        if (f12 >= f15) {
            f15 = f12;
        }
        if (f15 <= fE) {
            fE = f15;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fE);
        i14 = iFloatToRawIntBits >>> 31;
        i15 = (iFloatToRawIntBits >>> 23) & 255;
        i16 = iFloatToRawIntBits & 8388607;
        if (i15 == 255) {
            if (i16 != 0) {
                i19 = 512;
            } else {
                i19 = 0;
            }
            i17 = 31;
        } else {
            i17 = i15 - 112;
            if (i17 >= 31) {
                i19 = 0;
                i17 = 49;
            } else {
                if (i17 <= 0) {
                    i18 = i16 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                    } else {
                        i19 = i18;
                    }
                    short s19 = (short) i21;
                    f16 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f13 >= f16) {
                        f16 = f13;
                    }
                    if (f16 <= fE2) {
                        fE2 = f16;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i28 = i25 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i26 = i24 - 112;
                        if (i26 >= 31) {
                            i28 = 0;
                            i35 = 49;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                } else {
                                    i28 = i27;
                                    i35 = i26;
                                }
                                short s110 = (short) i29;
                                if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                    f17 = f14;
                                }
                                return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s19) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s110)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i26 >= -10) {
                                i31 = (i25 | 8388608) >> (1 - i26);
                                if ((i31 & 4096) != 0) {
                                    i31 += PKIFailureInfo.certRevoked;
                                }
                                i28 = i31 >> 13;
                            } else {
                                i28 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i23 << 15) | (i35 << 10);
                    short s111 = (short) i29;
                    if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                        f17 = f14;
                    }
                    return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s19) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s111)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i17 >= -10) {
                    i22 = (i16 | 8388608) >> (1 - i17);
                    if ((i22 & 4096) != 0) {
                        i22 += PKIFailureInfo.certRevoked;
                    }
                    i19 = i22 >> 13;
                    i17 = 0;
                } else {
                    i19 = 0;
                    i17 = 0;
                }
            }
        }
        i21 = i19 | (i14 << 15) | (i17 << 10);
        short s112 = (short) i21;
        f16 = cVar.f(2);
        fE2 = cVar.e(2);
        if (f13 >= f16) {
            f16 = f13;
        }
        if (f16 <= fE2) {
            fE2 = f16;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
        i23 = iFloatToRawIntBits2 >>> 31;
        i24 = (iFloatToRawIntBits2 >>> 23) & 255;
        i25 = 8388607 & iFloatToRawIntBits2;
        if (i24 == 255) {
            i28 = i25 != 0 ? 512 : 0;
            i35 = 31;
        } else {
            i26 = i24 - 112;
            if (i26 >= 31) {
                i28 = 0;
                i35 = 49;
            } else {
                if (i26 <= 0) {
                    i27 = i25 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                    } else {
                        i28 = i27;
                        i35 = i26;
                    }
                    short s113 = (short) i29;
                    if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                        f17 = f14;
                    }
                    return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s112) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s113)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i26 >= -10) {
                    i31 = (i25 | 8388608) >> (1 - i26);
                    if ((i31 & 4096) != 0) {
                        i31 += PKIFailureInfo.certRevoked;
                    }
                    i28 = i31 >> 13;
                } else {
                    i28 = 0;
                }
            }
        }
        i29 = i28 | (i23 << 15) | (i35 << 10);
        short s114 = (short) i29;
        if (f14 >= BitmapDescriptorFactory.HUE_RED) {
            f17 = f14;
        }
        return p1.m(jn0.c0.b((((long) iD) & 63) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s112) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s114)) << 16) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    public static final long b(int i11) {
        return p1.m(jn0.c0.b(jn0.c0.b(i11) << 32));
    }

    public static final long c(int i11, int i12, int i13, int i14) {
        return b(((i11 & 255) << 16) | ((i14 & 255) << 24) | ((i12 & 255) << 8) | (i13 & 255));
    }

    public static final long d(long j11) {
        return p1.m(jn0.c0.b(j11 << 32));
    }

    public static /* synthetic */ long e(float f11, float f12, float f13, float f14, l3.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f14 = 1.0f;
        }
        if ((i11 & 16) != 0) {
            cVar = l3.g.f89510a.w();
        }
        return a(f11, f12, f13, f14, cVar);
    }

    public static /* synthetic */ long f(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = 255;
        }
        return c(i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    public static final long g(float f11, float f12, float f13, float f14, l3.c cVar) {
        int i11;
        int i12;
        int i13;
        int iFloatToRawIntBits;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int iFloatToRawIntBits2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        if (cVar.getIsSrgb()) {
            return p1.m(jn0.c0.b(jn0.c0.b((((((int) ((f14 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16)) | (((int) ((f12 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f13) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f11);
        int i29 = iFloatToRawIntBits3 >>> 31;
        int i31 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i32 = iFloatToRawIntBits3 & 8388607;
        int i33 = 49;
        int i34 = 0;
        if (i31 == 255) {
            i12 = i32 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i31 - 112;
            if (i11 >= 31) {
                i11 = 49;
                i12 = 0;
            } else {
                if (i11 > 0) {
                    int i35 = i32 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i13 = (((i11 << 10) | i35) + 1) | (i29 << 15);
                    } else {
                        i12 = i35;
                    }
                    short s11 = (short) i13;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f12);
                    i14 = iFloatToRawIntBits >>> 31;
                    i15 = (iFloatToRawIntBits >>> 23) & 255;
                    i16 = iFloatToRawIntBits & 8388607;
                    if (i15 == 255) {
                        if (i16 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i17 = 31;
                    } else {
                        i17 = i15 - 112;
                        if (i17 >= 31) {
                            i17 = 49;
                            i19 = 0;
                        } else {
                            if (i17 <= 0) {
                                i18 = i16 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                                } else {
                                    i19 = i18;
                                }
                                short s12 = (short) i21;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
                                i23 = iFloatToRawIntBits2 >>> 31;
                                i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i25 = 8388607 & iFloatToRawIntBits2;
                                if (i24 == 255) {
                                    i26 = i24 - 112;
                                    if (i26 < 31) {
                                        if (i26 <= 0) {
                                            i34 = i25 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                            } else {
                                                i33 = i26;
                                            }
                                        } else if (i26 >= -10) {
                                            i28 = (i25 | 8388608) >> (1 - i26);
                                            if ((i28 & 4096) != 0) {
                                                i28 += PKIFailureInfo.certRevoked;
                                            }
                                            i33 = 0;
                                            i34 = i28 >> 13;
                                        } else {
                                            i33 = 0;
                                        }
                                    }
                                    return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                                }
                                i34 = i25 == 0 ? 0 : 512;
                                i33 = 31;
                                i27 = (i23 << 15) | (i33 << 10) | i34;
                                return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                            }
                            if (i17 >= -10) {
                                i22 = (i16 | 8388608) >> (1 - i17);
                                if ((i22 & 4096) != 0) {
                                    i22 += PKIFailureInfo.certRevoked;
                                }
                                i19 = i22 >> 13;
                                i17 = 0;
                            } else {
                                i19 = 0;
                                i17 = 0;
                            }
                        }
                    }
                    i21 = i19 | (i14 << 15) | (i17 << 10);
                    short s13 = (short) i21;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i26 = i24 - 112;
                        if (i26 < 31) {
                            if (i26 <= 0) {
                                i34 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                } else {
                                    i33 = i26;
                                }
                            } else if (i26 >= -10) {
                                i28 = (i25 | 8388608) >> (1 - i26);
                                if ((i28 & 4096) != 0) {
                                    i28 += PKIFailureInfo.certRevoked;
                                }
                                i33 = 0;
                                i34 = i28 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                        return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s13) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                    }
                    i34 = i25 == 0 ? 0 : 512;
                    i33 = 31;
                    i27 = (i23 << 15) | (i33 << 10) | i34;
                    return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s13) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                }
                if (i11 >= -10) {
                    int i36 = (i32 | 8388608) >> (1 - i11);
                    if ((i36 & 4096) != 0) {
                        i36 += PKIFailureInfo.certRevoked;
                    }
                    i12 = i36 >> 13;
                    i11 = 0;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
            }
        }
        i13 = i12 | (i29 << 15) | (i11 << 10);
        short s14 = (short) i13;
        iFloatToRawIntBits = Float.floatToRawIntBits(f12);
        i14 = iFloatToRawIntBits >>> 31;
        i15 = (iFloatToRawIntBits >>> 23) & 255;
        i16 = iFloatToRawIntBits & 8388607;
        if (i15 == 255) {
            if (i16 != 0) {
                i19 = 512;
            } else {
                i19 = 0;
            }
            i17 = 31;
        } else {
            i17 = i15 - 112;
            if (i17 >= 31) {
                i17 = 49;
                i19 = 0;
            } else {
                if (i17 <= 0) {
                    i18 = i16 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                    } else {
                        i19 = i18;
                    }
                    short s15 = (short) i21;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i26 = i24 - 112;
                        if (i26 < 31) {
                            if (i26 <= 0) {
                                i34 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                } else {
                                    i33 = i26;
                                }
                            } else if (i26 >= -10) {
                                i28 = (i25 | 8388608) >> (1 - i26);
                                if ((i28 & 4096) != 0) {
                                    i28 += PKIFailureInfo.certRevoked;
                                }
                                i33 = 0;
                                i34 = i28 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                        return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                    }
                    i34 = i25 == 0 ? 0 : 512;
                    i33 = 31;
                    i27 = (i23 << 15) | (i33 << 10) | i34;
                    return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                }
                if (i17 >= -10) {
                    i22 = (i16 | 8388608) >> (1 - i17);
                    if ((i22 & 4096) != 0) {
                        i22 += PKIFailureInfo.certRevoked;
                    }
                    i19 = i22 >> 13;
                    i17 = 0;
                } else {
                    i19 = 0;
                    i17 = 0;
                }
            }
        }
        i21 = i19 | (i14 << 15) | (i17 << 10);
        short s16 = (short) i21;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
        i23 = iFloatToRawIntBits2 >>> 31;
        i24 = (iFloatToRawIntBits2 >>> 23) & 255;
        i25 = 8388607 & iFloatToRawIntBits2;
        if (i24 == 255) {
            i26 = i24 - 112;
            if (i26 < 31) {
                if (i26 <= 0) {
                    i34 = i25 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                    } else {
                        i33 = i26;
                    }
                } else if (i26 >= -10) {
                    i28 = (i25 | 8388608) >> (1 - i26);
                    if ((i28 & 4096) != 0) {
                        i28 += PKIFailureInfo.certRevoked;
                    }
                    i33 = 0;
                    i34 = i28 >> 13;
                } else {
                    i33 = 0;
                }
            }
            return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
        }
        i34 = i25 == 0 ? 0 : 512;
        i33 = 31;
        i27 = (i23 << 15) | (i33 << 10) | i34;
        return p1.m(jn0.c0.b(((((long) ((short) i27)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
    }

    public static final long h(long j11, long j12) {
        long jN = p1.n(j11, p1.u(j12));
        float fS = p1.s(j12);
        float fS2 = p1.s(jN);
        float f11 = 1.0f - fS2;
        float f12 = (fS * f11) + fS2;
        float fW = p1.w(jN);
        float fW2 = p1.w(j12);
        float f13 = BitmapDescriptorFactory.HUE_RED;
        float f14 = f12 == BitmapDescriptorFactory.HUE_RED ? 0.0f : ((fW * fS2) + ((fW2 * fS) * f11)) / f12;
        float fV = f12 == BitmapDescriptorFactory.HUE_RED ? 0.0f : ((p1.v(jN) * fS2) + ((p1.v(j12) * fS) * f11)) / f12;
        float fT = p1.t(jN);
        float fT2 = p1.t(j12);
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
            f13 = ((fT * fS2) + ((fT2 * fS) * f11)) / f12;
        }
        return g(f14, fV, f13, f12, p1.u(j12));
    }

    public static final long i(long j11, long j12, float f11) {
        l3.c cVarT = l3.g.f89510a.t();
        long jN = p1.n(j11, cVarT);
        long jN2 = p1.n(j12, cVarT);
        float fS = p1.s(jN);
        float fW = p1.w(jN);
        float fV = p1.v(jN);
        float fT = p1.t(jN);
        float fS2 = p1.s(jN2);
        float fW2 = p1.w(jN2);
        float fV2 = p1.v(jN2);
        float fT2 = p1.t(jN2);
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        return p1.n(g(y4.b.b(fW, fW2, f11), y4.b.b(fV, fV2, f11), y4.b.b(fT, fT2, f11), y4.b.b(fS, fS2, f11), cVarT), p1.u(j12));
    }

    public static final float j(long j11) {
        l3.c cVarU = p1.u(j11);
        if (!l3.b.e(cVarU.getModel(), l3.b.INSTANCE.b())) {
            l3.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) l3.b.h(cVarU.getModel())));
        }
        p013kotlin.jvm.internal.s.i(cVarU, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        l3.j jVarI = ((l3.x) cVarU).getEotfFunc();
        float fA = (float) ((jVarI.a(p1.w(j11)) * 0.2126d) + (jVarI.a(p1.v(j11)) * 0.7152d) + (jVarI.a(p1.t(j11)) * 0.0722d));
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int k(long j11) {
        return (int) jn0.c0.b(p1.n(j11, l3.g.f89510a.w()) >>> 32);
    }
}
