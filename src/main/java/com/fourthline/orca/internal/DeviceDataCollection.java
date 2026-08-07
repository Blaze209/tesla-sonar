package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.F6, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\b\u0081\b\u0018\u0000 Z2\u00020\u0001:\rAODG4R?86KW)=B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u0099\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b=\u0010CR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bA\u0010FR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b6\u0010IR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bK\u0010M\u001a\u0004\bD\u0010NR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b)\u0010TR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b8\u0010U\u001a\u0004\bG\u0010VR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bR\u0010Y¨\u0006["}, d2 = {"Lcom/fourthline/orca/internal/F6;", "", "", "enabled", "", "uploadTimeoutMs", "Lcom/fourthline/orca/internal/F6$e;", "depth", "Lcom/fourthline/orca/internal/F6$j;", "motion", "Lcom/fourthline/orca/internal/F6$f;", AnalyticsAttribute.Environment, "Lcom/fourthline/orca/internal/F6$g;", "gps", "Lcom/fourthline/orca/internal/F6$c;", "cellular", "Lcom/fourthline/orca/internal/F6$k;", "network", "Lcom/fourthline/orca/internal/F6$h;", "hardware", "Lcom/fourthline/orca/internal/F6$l;", AnalyticsContext.Screen, "Lcom/fourthline/orca/internal/F6$b;", "battery", "Lcom/fourthline/orca/internal/F6$i;", "locale", "Lcom/fourthline/orca/internal/F6$m;", "system", "<init>", "(ZJLcom/fourthline/orca/internal/F6$e;Lcom/fourthline/orca/internal/F6$j;Lcom/fourthline/orca/internal/F6$f;Lcom/fourthline/orca/internal/F6$g;Lcom/fourthline/orca/internal/F6$c;Lcom/fourthline/orca/internal/F6$k;Lcom/fourthline/orca/internal/F6$h;Lcom/fourthline/orca/internal/F6$l;Lcom/fourthline/orca/internal/F6$b;Lcom/fourthline/orca/internal/F6$i;Lcom/fourthline/orca/internal/F6$m;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZJLcom/fourthline/orca/internal/F6$e;Lcom/fourthline/orca/internal/F6$j;Lcom/fourthline/orca/internal/F6$f;Lcom/fourthline/orca/internal/F6$g;Lcom/fourthline/orca/internal/F6$c;Lcom/fourthline/orca/internal/F6$k;Lcom/fourthline/orca/internal/F6$h;Lcom/fourthline/orca/internal/F6$l;Lcom/fourthline/orca/internal/F6$b;Lcom/fourthline/orca/internal/F6$i;Lcom/fourthline/orca/internal/F6$m;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "J", "l", "()J", "Lcom/fourthline/orca/internal/F6$e;", "getDepth", "()Lcom/fourthline/orca/internal/F6$e;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/F6$j;", "h", "()Lcom/fourthline/orca/internal/F6$j;", "e", "Lcom/fourthline/orca/internal/F6$f;", "()Lcom/fourthline/orca/internal/F6$f;", "f", "Lcom/fourthline/orca/internal/F6$g;", "()Lcom/fourthline/orca/internal/F6$g;", "g", "Lcom/fourthline/orca/internal/F6$c;", "()Lcom/fourthline/orca/internal/F6$c;", "Lcom/fourthline/orca/internal/F6$k;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/F6$k;", "Lcom/fourthline/orca/internal/F6$h;", "()Lcom/fourthline/orca/internal/F6$h;", "j", "Lcom/fourthline/orca/internal/F6$l;", "()Lcom/fourthline/orca/internal/F6$l;", "k", "Lcom/fourthline/orca/internal/F6$b;", "()Lcom/fourthline/orca/internal/F6$b;", "Lcom/fourthline/orca/internal/F6$i;", "()Lcom/fourthline/orca/internal/F6$i;", "m", "Lcom/fourthline/orca/internal/F6$m;", "()Lcom/fourthline/orca/internal/F6$m;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DeviceDataCollection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uploadTimeoutMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Depth depth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Motion motion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Environment environment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gps gps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cellular cellular;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Network network;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Hardware hardware;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Screen screen;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Battery battery;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Locale locale;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final System system;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25747b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25746a = aVar;
            f25747b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection", aVar, 13);
            m1Var.o("enabled", false);
            m1Var.o("uploadTimeoutMs", true);
            m1Var.o("depth", true);
            m1Var.o("motion", true);
            m1Var.o(AnalyticsAttribute.Environment, true);
            m1Var.o("gps", true);
            m1Var.o("cellular", true);
            m1Var.o("network", true);
            m1Var.o("hardware", true);
            m1Var.o(AnalyticsContext.Screen, true);
            m1Var.o("battery", true);
            m1Var.o("locale", true);
            m1Var.o("system", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceDataCollection deserialize(uo0.e decoder) {
            Depth depth;
            int i11;
            System system;
            Battery battery;
            Screen screen;
            Hardware hardware;
            Cellular cellular;
            Locale locale;
            Network network;
            Gps gps;
            Environment environment;
            Motion motion;
            long j11;
            boolean z11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                boolean zW = cVarB.w(fVar, 0);
                long j12 = cVarB.j(fVar, 1);
                depth = (Depth) cVarB.n(fVar, 2, Depth.a.f25755a, null);
                Motion motion2 = (Motion) cVarB.n(fVar, 3, Motion.a.f25770a, null);
                Environment environment2 = (Environment) cVarB.n(fVar, 4, Environment.a.f25758a, null);
                Gps gps2 = (Gps) cVarB.n(fVar, 5, Gps.a.f25761a, null);
                Cellular cellular2 = (Cellular) cVarB.n(fVar, 6, Cellular.a.f25752a, null);
                Network network2 = (Network) cVarB.n(fVar, 7, Network.a.f25773a, null);
                Hardware hardware2 = (Hardware) cVarB.n(fVar, 8, Hardware.a.f25764a, null);
                Screen screen2 = (Screen) cVarB.n(fVar, 9, Screen.a.f25776a, null);
                Battery battery2 = (Battery) cVarB.n(fVar, 10, Battery.a.f25749a, null);
                Locale locale2 = (Locale) cVarB.n(fVar, 11, Locale.a.f25767a, null);
                i11 = 8191;
                system = (System) cVarB.n(fVar, 12, System.a.f25779a, null);
                battery = battery2;
                screen = screen2;
                network = network2;
                cellular = cellular2;
                gps = gps2;
                motion = motion2;
                hardware = hardware2;
                environment = environment2;
                j11 = j12;
                locale = locale2;
                z11 = zW;
            } else {
                depth = null;
                System system2 = null;
                Battery battery3 = null;
                Screen screen3 = null;
                Hardware hardware3 = null;
                Cellular cellular3 = null;
                Locale locale3 = null;
                Network network3 = null;
                Gps gps3 = null;
                boolean z12 = true;
                boolean zW2 = false;
                long j13 = 0;
                Environment environment3 = null;
                Motion motion3 = null;
                i11 = 0;
                while (z12) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            zW2 = zW2;
                            break;
                        case 0:
                            i11 |= 1;
                            zW2 = cVarB.w(fVar, 0);
                            break;
                        case 1:
                            j13 = cVarB.j(fVar, 1);
                            i11 |= 2;
                            zW2 = zW2;
                            break;
                        case 2:
                            depth = (Depth) cVarB.n(fVar, 2, Depth.a.f25755a, depth);
                            i11 |= 4;
                            zW2 = zW2;
                            break;
                        case 3:
                            motion3 = (Motion) cVarB.n(fVar, 3, Motion.a.f25770a, motion3);
                            i11 |= 8;
                            zW2 = zW2;
                            break;
                        case 4:
                            environment3 = (Environment) cVarB.n(fVar, 4, Environment.a.f25758a, environment3);
                            i11 |= 16;
                            zW2 = zW2;
                            break;
                        case 5:
                            gps3 = (Gps) cVarB.n(fVar, 5, Gps.a.f25761a, gps3);
                            i11 |= 32;
                            zW2 = zW2;
                            break;
                        case 6:
                            cellular3 = (Cellular) cVarB.n(fVar, 6, Cellular.a.f25752a, cellular3);
                            i11 |= 64;
                            zW2 = zW2;
                            break;
                        case 7:
                            network3 = (Network) cVarB.n(fVar, 7, Network.a.f25773a, network3);
                            i11 |= 128;
                            zW2 = zW2;
                            break;
                        case 8:
                            hardware3 = (Hardware) cVarB.n(fVar, 8, Hardware.a.f25764a, hardware3);
                            i11 |= 256;
                            zW2 = zW2;
                            break;
                        case 9:
                            screen3 = (Screen) cVarB.n(fVar, 9, Screen.a.f25776a, screen3);
                            i11 |= 512;
                            zW2 = zW2;
                            break;
                        case 10:
                            battery3 = (Battery) cVarB.n(fVar, 10, Battery.a.f25749a, battery3);
                            i11 |= 1024;
                            zW2 = zW2;
                            break;
                        case 11:
                            locale3 = (Locale) cVarB.n(fVar, 11, Locale.a.f25767a, locale3);
                            i11 |= 2048;
                            zW2 = zW2;
                            break;
                        case 12:
                            system2 = (System) cVarB.n(fVar, 12, System.a.f25779a, system2);
                            i11 |= 4096;
                            zW2 = zW2;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                system = system2;
                battery = battery3;
                screen = screen3;
                hardware = hardware3;
                cellular = cellular3;
                locale = locale3;
                network = network3;
                gps = gps3;
                environment = environment3;
                motion = motion3;
                j11 = j13;
                z11 = zW2;
            }
            int i12 = i11;
            Depth depth2 = depth;
            cVarB.c(fVar);
            return new DeviceDataCollection(i12, z11, j11, depth2, motion, environment, gps, cellular, network, hardware, screen, battery, locale, system, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, vo0.s0.f119686a, Depth.a.f25755a, Motion.a.f25770a, Environment.a.f25758a, Gps.a.f25761a, Cellular.a.f25752a, Network.a.f25773a, Hardware.a.f25764a, Screen.a.f25776a, Battery.a.f25749a, Locale.a.f25767a, System.a.f25779a};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, DeviceDataCollection value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DeviceDataCollection.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$b;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$b;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Battery {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25750b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25749a = aVar;
                f25750b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Battery", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Battery deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Battery(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Battery value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Battery.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Battery> serializer() {
                return a.f25749a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Battery(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25749a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Battery self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Battery) && this.enabled == ((Battery) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Battery(enabled=" + this.enabled + ")";
        }

        public Battery(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$c;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Cellular {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25753b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25752a = aVar;
                f25753b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Cellular", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cellular deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Cellular(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Cellular value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Cellular.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Cellular> serializer() {
                return a.f25752a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Cellular(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25752a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Cellular self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cellular) && this.enabled == ((Cellular) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Cellular(enabled=" + this.enabled + ")";
        }

        public Cellular(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DeviceDataCollection> serializer() {
            return a.f25746a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$e, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/F6$e;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$e;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Depth {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$e$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25756b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25755a = aVar;
                f25756b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Depth", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Depth deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Depth(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Depth value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Depth.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Depth> serializer() {
                return a.f25755a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Depth(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25755a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Depth self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Depth) && this.enabled == ((Depth) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Depth(enabled=" + this.enabled + ")";
        }

        public Depth(boolean z11) {
            this.enabled = z11;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$f, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$f;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$f;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Environment {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$f$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25759b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25758a = aVar;
                f25759b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Environment", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Environment deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Environment(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Environment value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Environment.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Environment> serializer() {
                return a.f25758a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Environment(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25758a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Environment self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Environment) && this.enabled == ((Environment) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Environment(enabled=" + this.enabled + ")";
        }

        public Environment(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$g, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$g;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$g;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Gps {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$g$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25762b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25761a = aVar;
                f25762b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Gps", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Gps deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Gps(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Gps value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Gps.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Gps> serializer() {
                return a.f25761a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Gps(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25761a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Gps self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Gps) && this.enabled == ((Gps) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Gps(enabled=" + this.enabled + ")";
        }

        public Gps(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$h, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$h;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$h;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Hardware {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$h$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25765b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25764a = aVar;
                f25765b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Hardware", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Hardware deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Hardware(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Hardware value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Hardware.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Hardware> serializer() {
                return a.f25764a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Hardware(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25764a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Hardware self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hardware) && this.enabled == ((Hardware) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Hardware(enabled=" + this.enabled + ")";
        }

        public Hardware(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$i, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$i;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$i;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Locale {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$i$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25768b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25767a = aVar;
                f25768b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Locale", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Locale deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Locale(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Locale value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Locale.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$i$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Locale> serializer() {
                return a.f25767a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Locale(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25767a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Locale self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Locale) && this.enabled == ((Locale) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Locale(enabled=" + this.enabled + ")";
        }

        public Locale(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$j, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$j;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$j;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Motion {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$j$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25771b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25770a = aVar;
                f25771b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Motion", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Motion deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Motion(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Motion value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Motion.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$j$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Motion> serializer() {
                return a.f25770a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Motion(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25770a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Motion self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Motion) && this.enabled == ((Motion) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Motion(enabled=" + this.enabled + ")";
        }

        public Motion(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$k, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$k;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$k;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Network {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$k$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25774b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25773a = aVar;
                f25774b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Network", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Network deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Network(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Network value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Network.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$k$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Network> serializer() {
                return a.f25773a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Network(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25773a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Network self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Network) && this.enabled == ((Network) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Network(enabled=" + this.enabled + ")";
        }

        public Network(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$l, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$l;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$l;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Screen {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$l$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25776a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25777b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25776a = aVar;
                f25777b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.Screen", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Screen deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new Screen(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, Screen value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Screen.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$l$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Screen> serializer() {
                return a.f25776a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Screen(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25776a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(Screen self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && this.enabled == ((Screen) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Screen(enabled=" + this.enabled + ")";
        }

        public Screen(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$m, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0011\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/internal/F6$m;", "", "", "enabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/F6$m;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class System {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$m$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25780b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f25779a = aVar;
                f25780b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DeviceDataCollection.System", aVar, 1);
                m1Var.o("enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final System deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new System(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, System value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                System.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.F6$m$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<System> serializer() {
                return a.f25779a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ System(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f25779a.getDescriptor());
            }
            this.enabled = z11;
        }

        public static final /* synthetic */ void a(System self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof System) && this.enabled == ((System) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "System(enabled=" + this.enabled + ")";
        }

        public System(boolean z11) {
            this.enabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    public /* synthetic */ DeviceDataCollection(int i11, boolean z11, long j11, Depth depth, Motion motion, Environment environment, Gps gps, Cellular cellular, Network network, Hardware hardware, Screen screen, Battery battery, Locale locale, System system, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f25746a.getDescriptor());
        }
        this.enabled = z11;
        if ((i11 & 2) == 0) {
            this.uploadTimeoutMs = 2000L;
        } else {
            this.uploadTimeoutMs = j11;
        }
        if ((i11 & 4) == 0) {
            this.depth = new Depth(false);
        } else {
            this.depth = depth;
        }
        if ((i11 & 8) == 0) {
            this.motion = new Motion(false);
        } else {
            this.motion = motion;
        }
        if ((i11 & 16) == 0) {
            this.environment = new Environment(false);
        } else {
            this.environment = environment;
        }
        if ((i11 & 32) == 0) {
            this.gps = new Gps(false);
        } else {
            this.gps = gps;
        }
        if ((i11 & 64) == 0) {
            this.cellular = new Cellular(false);
        } else {
            this.cellular = cellular;
        }
        if ((i11 & 128) == 0) {
            this.network = new Network(false);
        } else {
            this.network = network;
        }
        if ((i11 & 256) == 0) {
            this.hardware = new Hardware(false);
        } else {
            this.hardware = hardware;
        }
        if ((i11 & 512) == 0) {
            this.screen = new Screen(false);
        } else {
            this.screen = screen;
        }
        if ((i11 & 1024) == 0) {
            this.battery = new Battery(false);
        } else {
            this.battery = battery;
        }
        this.locale = (i11 & 2048) == 0 ? new Locale(false) : locale;
        this.system = (i11 & 4096) == 0 ? new System(false) : system;
    }

    public static final /* synthetic */ void a(DeviceDataCollection self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        if (output.G(serialDesc, 1) || self.uploadTimeoutMs != 2000) {
            output.z(serialDesc, 1, self.uploadTimeoutMs);
        }
        if (output.G(serialDesc, 2) || !p013kotlin.jvm.internal.s.f(self.depth, new Depth(false))) {
            output.D(serialDesc, 2, Depth.a.f25755a, self.depth);
        }
        if (output.G(serialDesc, 3) || !p013kotlin.jvm.internal.s.f(self.motion, new Motion(false))) {
            output.D(serialDesc, 3, Motion.a.f25770a, self.motion);
        }
        if (output.G(serialDesc, 4) || !p013kotlin.jvm.internal.s.f(self.environment, new Environment(false))) {
            output.D(serialDesc, 4, Environment.a.f25758a, self.environment);
        }
        if (output.G(serialDesc, 5) || !p013kotlin.jvm.internal.s.f(self.gps, new Gps(false))) {
            output.D(serialDesc, 5, Gps.a.f25761a, self.gps);
        }
        if (output.G(serialDesc, 6) || !p013kotlin.jvm.internal.s.f(self.cellular, new Cellular(false))) {
            output.D(serialDesc, 6, Cellular.a.f25752a, self.cellular);
        }
        if (output.G(serialDesc, 7) || !p013kotlin.jvm.internal.s.f(self.network, new Network(false))) {
            output.D(serialDesc, 7, Network.a.f25773a, self.network);
        }
        if (output.G(serialDesc, 8) || !p013kotlin.jvm.internal.s.f(self.hardware, new Hardware(false))) {
            output.D(serialDesc, 8, Hardware.a.f25764a, self.hardware);
        }
        if (output.G(serialDesc, 9) || !p013kotlin.jvm.internal.s.f(self.screen, new Screen(false))) {
            output.D(serialDesc, 9, Screen.a.f25776a, self.screen);
        }
        if (output.G(serialDesc, 10) || !p013kotlin.jvm.internal.s.f(self.battery, new Battery(false))) {
            output.D(serialDesc, 10, Battery.a.f25749a, self.battery);
        }
        if (output.G(serialDesc, 11) || !p013kotlin.jvm.internal.s.f(self.locale, new Locale(false))) {
            output.D(serialDesc, 11, Locale.a.f25767a, self.locale);
        }
        if (!output.G(serialDesc, 12) && p013kotlin.jvm.internal.s.f(self.system, new System(false))) {
            return;
        }
        output.D(serialDesc, 12, System.a.f25779a, self.system);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Cellular getCellular() {
        return this.cellular;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Gps getGps() {
        return this.gps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDataCollection)) {
            return false;
        }
        DeviceDataCollection deviceDataCollection = (DeviceDataCollection) other;
        return this.enabled == deviceDataCollection.enabled && this.uploadTimeoutMs == deviceDataCollection.uploadTimeoutMs && p013kotlin.jvm.internal.s.f(this.depth, deviceDataCollection.depth) && p013kotlin.jvm.internal.s.f(this.motion, deviceDataCollection.motion) && p013kotlin.jvm.internal.s.f(this.environment, deviceDataCollection.environment) && p013kotlin.jvm.internal.s.f(this.gps, deviceDataCollection.gps) && p013kotlin.jvm.internal.s.f(this.cellular, deviceDataCollection.cellular) && p013kotlin.jvm.internal.s.f(this.network, deviceDataCollection.network) && p013kotlin.jvm.internal.s.f(this.hardware, deviceDataCollection.hardware) && p013kotlin.jvm.internal.s.f(this.screen, deviceDataCollection.screen) && p013kotlin.jvm.internal.s.f(this.battery, deviceDataCollection.battery) && p013kotlin.jvm.internal.s.f(this.locale, deviceDataCollection.locale) && p013kotlin.jvm.internal.s.f(this.system, deviceDataCollection.system);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Hardware getHardware() {
        return this.hardware;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Motion getMotion() {
        return this.motion;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Boolean.hashCode(this.enabled) * 31) + Long.hashCode(this.uploadTimeoutMs)) * 31) + this.depth.hashCode()) * 31) + this.motion.hashCode()) * 31) + this.environment.hashCode()) * 31) + this.gps.hashCode()) * 31) + this.cellular.hashCode()) * 31) + this.network.hashCode()) * 31) + this.hardware.hashCode()) * 31) + this.screen.hashCode()) * 31) + this.battery.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.system.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final System getSystem() {
        return this.system;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getUploadTimeoutMs() {
        return this.uploadTimeoutMs;
    }

    public String toString() {
        return "DeviceDataCollection(enabled=" + this.enabled + ", uploadTimeoutMs=" + this.uploadTimeoutMs + ", depth=" + this.depth + ", motion=" + this.motion + ", environment=" + this.environment + ", gps=" + this.gps + ", cellular=" + this.cellular + ", network=" + this.network + ", hardware=" + this.hardware + ", screen=" + this.screen + ", battery=" + this.battery + ", locale=" + this.locale + ", system=" + this.system + ")";
    }

    public DeviceDataCollection(boolean z11, long j11, Depth depth, Motion motion, Environment environment, Gps gps, Cellular cellular, Network network, Hardware hardware, Screen screen, Battery battery, Locale locale, System system) {
        p013kotlin.jvm.internal.s.k(depth, "depth");
        p013kotlin.jvm.internal.s.k(motion, "motion");
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(gps, "gps");
        p013kotlin.jvm.internal.s.k(cellular, "cellular");
        p013kotlin.jvm.internal.s.k(network, "network");
        p013kotlin.jvm.internal.s.k(hardware, "hardware");
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(battery, "battery");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        p013kotlin.jvm.internal.s.k(system, "system");
        this.enabled = z11;
        this.uploadTimeoutMs = j11;
        this.depth = depth;
        this.motion = motion;
        this.environment = environment;
        this.gps = gps;
        this.cellular = cellular;
        this.network = network;
        this.hardware = hardware;
        this.screen = screen;
        this.battery = battery;
        this.locale = locale;
        this.system = system;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Battery getBattery() {
        return this.battery;
    }

    public /* synthetic */ DeviceDataCollection(boolean z11, long j11, Depth depth, Motion motion, Environment environment, Gps gps, Cellular cellular, Network network, Hardware hardware, Screen screen, Battery battery, Locale locale, System system, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? 2000L : j11, (i11 & 4) != 0 ? new Depth(false) : depth, (i11 & 8) != 0 ? new Motion(false) : motion, (i11 & 16) != 0 ? new Environment(false) : environment, (i11 & 32) != 0 ? new Gps(false) : gps, (i11 & 64) != 0 ? new Cellular(false) : cellular, (i11 & 128) != 0 ? new Network(false) : network, (i11 & 256) != 0 ? new Hardware(false) : hardware, (i11 & 512) != 0 ? new Screen(false) : screen, (i11 & 1024) != 0 ? new Battery(false) : battery, (i11 & 2048) != 0 ? new Locale(false) : locale, (i11 & 4096) != 0 ? new System(false) : system);
    }
}
