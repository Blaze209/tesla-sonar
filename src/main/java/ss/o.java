package ss;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.math.ec.Tnaf;
import ts.b0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o implements d, z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111690p = com.google.common.collect.x.v(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111691q = com.google.common.collect.x.v(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111692r = com.google.common.collect.x.v(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111693s = com.google.common.collect.x.v(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111694t = com.google.common.collect.x.v(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.common.collect.x<Long> f111695u = com.google.common.collect.x.v(2800000L, Long.valueOf(ComponentTracker.DEFAULT_TIMEOUT), 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static o f111696v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.z<Integer, Long> f111697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a.C2386a f111698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f111699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.d f111700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f111701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f111703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f111704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f111706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f111707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f111708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f111709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f111710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f111711o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f111712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f111713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f111714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ts.d f111715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f111716e;

        public b(Context context) {
            this.f111712a = context == null ? null : context.getApplicationContext();
            this.f111713b = b(p0.J(context));
            this.f111714c = 2000;
            this.f111715d = ts.d.f114979a;
            this.f111716e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] iArrJ = o.j(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            com.google.common.collect.x<Long> xVar = o.f111690p;
            map.put(2, xVar.get(iArrJ[0]));
            map.put(3, o.f111691q.get(iArrJ[1]));
            map.put(4, o.f111692r.get(iArrJ[2]));
            map.put(5, o.f111693s.get(iArrJ[3]));
            map.put(10, o.f111694t.get(iArrJ[4]));
            map.put(9, o.f111695u.get(iArrJ[5]));
            map.put(7, xVar.get(iArrJ[0]));
            return map;
        }

        public o a() {
            return new o(this.f111712a, this.f111713b, this.f111714c, this.f111715d, this.f111716e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] j(String str) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b11 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b11 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b11 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b11 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b11 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b11 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b11 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b11 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b11 = 8;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b11 = 9;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b11 = 10;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b11 = 11;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b11 = 12;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b11 = 13;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b11 = 14;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b11 = 15;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b11 = 17;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b11 = 18;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b11 = 19;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b11 = 20;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b11 = 21;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b11 = 22;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b11 = 23;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b11 = 24;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b11 = 25;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b11 = 26;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b11 = 27;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b11 = 28;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b11 = 29;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b11 = 30;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b11 = 31;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b11 = 32;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b11 = 33;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b11 = 34;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b11 = 35;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b11 = 36;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b11 = 37;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b11 = 38;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b11 = 39;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b11 = 40;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b11 = 41;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b11 = 42;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b11 = 43;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b11 = 44;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b11 = 45;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b11 = 46;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b11 = 47;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b11 = 48;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b11 = 49;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b11 = 50;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b11 = 51;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b11 = 52;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b11 = 53;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b11 = 54;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b11 = 55;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b11 = 56;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b11 = 57;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b11 = 58;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b11 = 59;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b11 = 60;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b11 = 61;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b11 = 62;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b11 = 63;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b11 = 64;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b11 = 65;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b11 = 66;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b11 = 67;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b11 = 68;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b11 = 69;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b11 = 70;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b11 = 71;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b11 = 72;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b11 = 73;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b11 = 74;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b11 = 75;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b11 = 76;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b11 = 77;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b11 = 78;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b11 = 79;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b11 = 80;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b11 = 81;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b11 = 82;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b11 = 83;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b11 = 84;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b11 = 85;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b11 = 86;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b11 = 87;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b11 = 88;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    b11 = 89;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b11 = 90;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b11 = 91;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b11 = 92;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b11 = 93;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b11 = 94;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b11 = 95;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b11 = 96;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b11 = 97;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b11 = 98;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b11 = 99;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b11 = 100;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b11 = 101;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b11 = 102;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b11 = 103;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b11 = 104;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b11 = 105;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b11 = 106;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b11 = 107;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b11 = 108;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b11 = 109;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b11 = 110;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b11 = 111;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b11 = 112;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b11 = 113;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b11 = 114;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b11 = 115;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b11 = 116;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b11 = 117;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b11 = 118;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b11 = 119;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b11 = 120;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b11 = 121;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b11 = 122;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b11 = 123;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b11 = 124;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b11 = 125;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b11 = 126;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b11 = 127;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b11 = 128;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b11 = 129;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b11 = 130;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b11 = 131;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b11 = 132;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b11 = 133;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b11 = 134;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b11 = 135;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b11 = 136;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b11 = 137;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b11 = 138;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b11 = 139;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b11 = 140;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b11 = 141;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b11 = 142;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b11 = 143;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b11 = 144;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b11 = 145;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b11 = 146;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b11 = 147;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b11 = 148;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b11 = 149;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b11 = 150;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b11 = 151;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b11 = 152;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b11 = 153;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b11 = 154;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b11 = 155;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b11 = 156;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b11 = 157;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b11 = 158;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b11 = 159;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b11 = 160;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b11 = 161;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b11 = 162;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b11 = 163;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b11 = 164;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b11 = 165;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b11 = 166;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b11 = 167;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b11 = 168;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b11 = 169;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b11 = 170;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b11 = 171;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b11 = 172;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b11 = 173;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b11 = 174;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b11 = 175;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b11 = 176;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b11 = 177;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b11 = 178;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b11 = 179;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b11 = 180;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b11 = 181;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b11 = 182;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b11 = 183;
                }
                break;
            case 2640:
                if (str.equals(BouncyCastleProvider.PROVIDER_NAME)) {
                    b11 = 184;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b11 = 185;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b11 = 186;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b11 = 187;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b11 = 188;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b11 = 189;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b11 = 190;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b11 = 191;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b11 = 192;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b11 = 193;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b11 = 194;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b11 = 195;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b11 = 196;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b11 = 197;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b11 = 198;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b11 = 199;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b11 = 200;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b11 = 201;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b11 = 202;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b11 = 203;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b11 = 204;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b11 = 205;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b11 = 206;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b11 = 207;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    b11 = 208;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b11 = 209;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b11 = 210;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b11 = 211;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b11 = 212;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b11 = 213;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b11 = 214;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b11 = 215;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b11 = 216;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b11 = 217;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b11 = 218;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b11 = 219;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b11 = 220;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b11 = 221;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b11 = 222;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b11 = 223;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b11 = 224;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b11 = 225;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b11 = 226;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b11 = 227;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b11 = 228;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b11 = 229;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b11 = 230;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b11 = 231;
                }
                break;
            case NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT /* 2803 */:
                if (str.equals("XK")) {
                    b11 = 232;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b11 = 233;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b11 = 234;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b11 = 235;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b11 = 236;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b11 = 237;
                }
                break;
        }
        switch (b11) {
            case 0:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case 56:
            case 68:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 10:
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case 12:
            case 85:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 13:
            case 50:
            case 120:
            case 140:
            case 143:
            case 170:
            case 193:
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case 58:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case 94:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 116:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case 63:
            case 83:
            case 189:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case 91:
            case 133:
            case 153:
            case SDK_ASSET_ICON_CLEARED_REC_VALUE:
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
            case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case 132:
            case 175:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 118:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{1, 1, 2, 3, 2, 2};
            case 34:
            case 41:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 3, 3, 3, 3};
            case 36:
            case 111:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 37:
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 76:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 0, 0, 3};
            case 40:
            case 61:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 42:
                return new int[]{1, 1, 2, 1, 3, 2};
            case 43:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 44:
                return new int[]{2, 0, 4, 3, 3, 1};
            case 45:
                return new int[]{2, 3, 4, 2, 2, 2};
            case 46:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 47:
            case 110:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 48:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 51:
            case 90:
            case 126:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 3, 2, 2, 2};
            case 54:
            case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
            case SDK_ASSET_ICON_COMMENT_VALUE:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 55:
            case 60:
            case 92:
            case 124:
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
            case 194:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 2, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 3, 2, 2};
            case 67:
                return new int[]{4, 2, 3, 0, 2, 2};
            case 69:
                return new int[]{1, 1, 2, 1, 1, 2};
            case 70:
            case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 71:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 72:
            case 112:
            case 115:
            case 119:
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 0, 0, 2, 2, 2};
            case 74:
            case 168:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 75:
                return new int[]{0, 2, 1, 0, 2, 2};
            case 77:
            case 103:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 78:
            case SDK_ASSET_ICON_INCOME_VALUE:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 79:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 80:
                return new int[]{4, 4, 4, 2, 2, 2};
            case 81:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 82:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 84:
                return new int[]{2, 2, 2, 1, 1, 2};
            case 86:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 87:
                return new int[]{3, 0, 1, 1, 2, 2};
            case 88:
                return new int[]{0, 1, 1, 3, 2, 0};
            case 89:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 93:
                return new int[]{3, 1, 1, 2, 3, 2};
            case 95:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 96:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 2, 1, 2, 1};
            case 98:
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
            case 190:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 100:
                return new int[]{4, 2, 3, 3, 4, 2};
            case 101:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 102:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 104:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 105:
                return new int[]{2, 0, 1, 1, 2, 2};
            case 106:
                return new int[]{0, 3, 3, 3, 4, 4};
            case 107:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 108:
            case 141:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 109:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 113:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 114:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 117:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 121:
                return new int[]{3, 2, 3, 4, 4, 2};
            case 122:
                return new int[]{3, 4, 3, 4, 2, 2};
            case 123:
            case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 125:
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case SDK_ASSET_ICON_OVERRIDE_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return new int[]{0, 2, 2, 0, 2, 2};
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case 135:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 136:
            case SDK_ASSET_ICON_PROGRESS_VALUE:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 137:
                return new int[]{2, 2, 2, 3, 4, 2};
            case 138:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 139:
                return new int[]{0, 2, 4, 4, 4, 2};
            case 142:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 145:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 146:
                return new int[]{3, 4, 1, 3, 3, 2};
            case 147:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 152:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 155:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 156:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case 160:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case SDK_ASSET_ICON_CANCEL_VALUE:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case 172:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case 195:
                return new int[]{3, 2, 2, 4, 4, 2};
            case 196:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                return new int[]{4, 2, 2, 3, 2, 2};
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                return new int[]{2, 2, 1, 2, 2, 2};
            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                return new int[]{4, 4, 3, 4, 2, 2};
            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                return new int[]{2, 2, 1, 3, 2, 2};
            case SDK_ASSET_ICON_CLOCK_VALUE:
                return new int[]{0, 1, 2, 1, 2, 2};
            case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case SDK_ASSET_ICON_SUBMIT_VALUE:
                return new int[]{2, 1, 1, 1, 2, 2};
            case SDK_ASSET_ICON_PAUSE_VALUE:
                return new int[]{1, 0, 0, 1, 3, 2};
            case SDK_ASSET_ICON_PIN_VALUE:
                return new int[]{1, 4, 0, 0, 2, 2};
            case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                return new int[]{0, 2, 0, 0, 0, 0};
            case SDK_ASSET_ICON_QUESTION_VALUE:
                return new int[]{0, 1, 1, 2, 4, 2};
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                return new int[]{1, 1, 4, 1, 3, 1};
            case SDK_ASSET_ICON_SUBTRACT_VALUE:
                return new int[]{2, 2, 3, 4, 3, 2};
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                return new int[]{2, 2, 0, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                return new int[]{0, 2, 1, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                return new int[]{0, 0, 1, 2, 2, 1};
            case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                return new int[]{4, 3, 3, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                return new int[]{1, 2, 1, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                return new int[]{2, 3, 3, 4, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                return new int[]{2, 3, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long k(int i11) {
        Long l11 = this.f111697a.get(Integer.valueOf(i11));
        if (l11 == null) {
            l11 = this.f111697a.get(0);
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    public static synchronized o l(Context context) {
        try {
            if (f111696v == null) {
                f111696v = new b(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f111696v;
    }

    private static boolean m(l lVar, boolean z11) {
        return z11 && !lVar.d(8);
    }

    private void n(int i11, long j11, long j12) {
        if (i11 == 0 && j11 == 0 && j12 == this.f111709m) {
            return;
        }
        this.f111709m = j12;
        this.f111698b.c(i11, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(int i11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i12 = this.f111705i;
                if (i12 != 0) {
                    try {
                        if (!this.f111701e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                if (this.f111710n) {
                    i11 = this.f111711o;
                }
                if (i12 == i11) {
                    return;
                }
                this.f111705i = i11;
                if (i11 == 1 || i11 == 0 || i11 == 8) {
                    return;
                }
                this.f111708l = k(i11);
                long jElapsedRealtime = this.f111700d.elapsedRealtime();
                n(this.f111702f > 0 ? (int) (jElapsedRealtime - this.f111703g) : 0, this.f111704h, this.f111708l);
                this.f111703g = jElapsedRealtime;
                this.f111704h = 0L;
                this.f111707k = 0L;
                this.f111706j = 0L;
                this.f111699c.g();
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    @Override // ss.z
    public synchronized void b(i iVar, l lVar, boolean z11, int i11) {
        if (m(lVar, z11)) {
            this.f111704h += (long) i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // ss.z
    public synchronized void c(i iVar, l lVar, boolean z11) throws Throwable {
        Throwable th2;
        o oVar;
        try {
            try {
                if (m(lVar, z11)) {
                    ts.a.g(this.f111702f > 0);
                    long jElapsedRealtime = this.f111700d.elapsedRealtime();
                    int i11 = (int) (jElapsedRealtime - this.f111703g);
                    this.f111706j += (long) i11;
                    long j11 = this.f111707k;
                    long j12 = this.f111704h;
                    this.f111707k = j11 + j12;
                    if (i11 > 0) {
                        this.f111699c.c((int) Math.sqrt(j12), (j12 * 8000.0f) / i11);
                        if (this.f111706j < 2000) {
                            try {
                                if (this.f111707k >= 524288) {
                                    this.f111708l = (long) this.f111699c.f(0.5f);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            this.f111708l = (long) this.f111699c.f(0.5f);
                        }
                        oVar = this;
                        oVar.n(i11, this.f111704h, this.f111708l);
                        oVar.f111703g = jElapsedRealtime;
                        oVar.f111704h = 0L;
                    } else {
                        oVar = this;
                    }
                    oVar.f111702f--;
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    @Override // ss.d
    public void d(d.a aVar) {
        this.f111698b.d(aVar);
    }

    @Override // ss.z
    public synchronized void e(i iVar, l lVar, boolean z11) {
        try {
            if (m(lVar, z11)) {
                if (this.f111702f == 0) {
                    this.f111703g = this.f111700d.elapsedRealtime();
                }
                this.f111702f++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ss.d
    public void g(Handler handler, d.a aVar) {
        ts.a.e(handler);
        ts.a.e(aVar);
        this.f111698b.b(handler, aVar);
    }

    private o(Context context, Map<Integer, Long> map, int i11, ts.d dVar, boolean z11) {
        this.f111697a = com.google.common.collect.z.d(map);
        this.f111698b = new d.a.C2386a();
        this.f111699c = new x(i11);
        this.f111700d = dVar;
        this.f111701e = z11;
        if (context == null) {
            this.f111705i = 0;
            this.f111708l = k(0);
            return;
        }
        b0 b0VarD = b0.d(context);
        int iF = b0VarD.f();
        this.f111705i = iF;
        this.f111708l = k(iF);
        b0VarD.h(new b0.c() { // from class: ss.n
            @Override // ts.b0.c
            public final void a(int i12) throws Throwable {
                this.f111689a.o(i12);
            }
        });
    }

    @Override // ss.d
    public z a() {
        return this;
    }

    @Override // ss.z
    public void f(i iVar, l lVar, boolean z11) {
    }
}
