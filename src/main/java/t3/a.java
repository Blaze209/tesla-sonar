package t3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lt3/a;", "", "", "keyCode", "o", "(J)J", "", "s", "(J)Ljava/lang/String;", "", "r", "(J)I", "other", "", "p", "(JLjava/lang/Object;)Z", "a", "J", "getKeyCode", "()J", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long keyCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f112118c = f.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f112124d = f.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f112130e = f.a(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f112136f = f.a(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f112142g = f.a(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f112148h = f.a(EnumC4419g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f112154i = f.a(EnumC4419g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f112160j = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f112166k = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f112172l = f.a(EnumC4419g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f112178m = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f112184n = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f112190o = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f112196p = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f112202q = f.a(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f112208r = f.a(6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f112214s = f.a(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f112220t = f.a(20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f112226u = f.a(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f112232v = f.a(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f112238w = f.a(23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f112244x = f.a(EnumC4419g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f112250y = f.a(EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f112256z = f.a(EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
    private static final long A = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE);
    private static final long B = f.a(24);
    private static final long C = f.a(25);
    private static final long D = f.a(26);
    private static final long E = f.a(27);
    private static final long F = f.a(28);
    private static final long G = f.a(7);
    private static final long H = f.a(8);
    private static final long I = f.a(9);
    private static final long J = f.a(10);
    private static final long K = f.a(11);
    private static final long L = f.a(12);
    private static final long M = f.a(13);
    private static final long N = f.a(14);
    private static final long O = f.a(15);
    private static final long P = f.a(16);
    private static final long Q = f.a(81);
    private static final long R = f.a(69);
    private static final long S = f.a(17);
    private static final long T = f.a(70);
    private static final long U = f.a(18);
    private static final long V = f.a(29);
    private static final long W = f.a(30);
    private static final long X = f.a(31);
    private static final long Y = f.a(32);
    private static final long Z = f.a(33);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f112107a0 = f.a(34);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final long f112113b0 = f.a(35);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final long f112119c0 = f.a(36);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f112125d0 = f.a(37);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final long f112131e0 = f.a(38);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f112137f0 = f.a(39);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f112143g0 = f.a(40);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final long f112149h0 = f.a(41);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final long f112155i0 = f.a(42);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final long f112161j0 = f.a(43);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final long f112167k0 = f.a(44);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final long f112173l0 = f.a(45);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final long f112179m0 = f.a(46);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final long f112185n0 = f.a(47);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final long f112191o0 = f.a(48);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f112197p0 = f.a(49);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final long f112203q0 = f.a(50);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final long f112209r0 = f.a(51);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final long f112215s0 = f.a(52);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final long f112221t0 = f.a(53);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final long f112227u0 = f.a(54);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final long f112233v0 = f.a(55);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final long f112239w0 = f.a(56);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final long f112245x0 = f.a(57);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final long f112251y0 = f.a(58);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final long f112257z0 = f.a(59);
    private static final long A0 = f.a(60);
    private static final long B0 = f.a(61);
    private static final long C0 = f.a(62);
    private static final long D0 = f.a(63);
    private static final long E0 = f.a(64);
    private static final long F0 = f.a(65);
    private static final long G0 = f.a(66);
    private static final long H0 = f.a(67);
    private static final long I0 = f.a(112);
    private static final long J0 = f.a(111);
    private static final long K0 = f.a(113);
    private static final long L0 = f.a(114);
    private static final long M0 = f.a(115);
    private static final long N0 = f.a(116);
    private static final long O0 = f.a(117);
    private static final long P0 = f.a(118);
    private static final long Q0 = f.a(119);
    private static final long R0 = f.a(120);
    private static final long S0 = f.a(121);
    private static final long T0 = f.a(122);
    private static final long U0 = f.a(123);
    private static final long V0 = f.a(124);
    private static final long W0 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
    private static final long X0 = f.a(EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
    private static final long Y0 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
    private static final long Z0 = f.a(68);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final long f112108a1 = f.a(71);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final long f112114b1 = f.a(72);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final long f112120c1 = f.a(76);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final long f112126d1 = f.a(73);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final long f112132e1 = f.a(74);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final long f112138f1 = f.a(75);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final long f112144g1 = f.a(77);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final long f112150h1 = f.a(78);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final long f112156i1 = f.a(79);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final long f112162j1 = f.a(80);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final long f112168k1 = f.a(82);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final long f112174l1 = f.a(83);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final long f112180m1 = f.a(84);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final long f112186n1 = f.a(92);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final long f112192o1 = f.a(93);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f112198p1 = f.a(94);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final long f112204q1 = f.a(95);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final long f112210r1 = f.a(96);

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final long f112216s1 = f.a(97);

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final long f112222t1 = f.a(98);

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final long f112228u1 = f.a(99);

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final long f112234v1 = f.a(100);

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final long f112240w1 = f.a(101);

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final long f112246x1 = f.a(102);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final long f112252y1 = f.a(103);

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final long f112258z1 = f.a(104);
    private static final long A1 = f.a(105);
    private static final long B1 = f.a(106);
    private static final long C1 = f.a(107);
    private static final long D1 = f.a(108);
    private static final long E1 = f.a(109);
    private static final long F1 = f.a(110);
    private static final long G1 = f.a(188);
    private static final long H1 = f.a(189);
    private static final long I1 = f.a(190);
    private static final long J1 = f.a(191);
    private static final long K1 = f.a(192);
    private static final long L1 = f.a(193);
    private static final long M1 = f.a(194);
    private static final long N1 = f.a(195);
    private static final long O1 = f.a(196);
    private static final long P1 = f.a(197);
    private static final long Q1 = f.a(EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE);
    private static final long R1 = f.a(EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE);
    private static final long S1 = f.a(200);
    private static final long T1 = f.a(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE);
    private static final long U1 = f.a(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE);
    private static final long V1 = f.a(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
    private static final long W1 = f.a(125);
    private static final long X1 = f.a(131);
    private static final long Y1 = f.a(132);
    private static final long Z1 = f.a(133);

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private static final long f112109a2 = f.a(134);

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final long f112115b2 = f.a(135);

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static final long f112121c2 = f.a(136);

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static final long f112127d2 = f.a(137);

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private static final long f112133e2 = f.a(138);

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final long f112139f2 = f.a(139);

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final long f112145g2 = f.a(140);

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final long f112151h2 = f.a(141);

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final long f112157i2 = f.a(142);

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final long f112163j2 = f.a(143);

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private static final long f112169k2 = f.a(144);

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private static final long f112175l2 = f.a(145);

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final long f112181m2 = f.a(146);

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private static final long f112187n2 = f.a(147);

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private static final long f112193o2 = f.a(148);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final long f112199p2 = f.a(149);

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final long f112205q2 = f.a(150);

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final long f112211r2 = f.a(151);

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private static final long f112217s2 = f.a(152);

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private static final long f112223t2 = f.a(153);

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private static final long f112229u2 = f.a(154);

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private static final long f112235v2 = f.a(155);

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final long f112241w2 = f.a(156);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f112247x2 = f.a(157);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final long f112253y2 = f.a(158);

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final long f112259z2 = f.a(159);
    private static final long A2 = f.a(160);
    private static final long B2 = f.a(161);
    private static final long C2 = f.a(162);
    private static final long D2 = f.a(163);
    private static final long E2 = f.a(126);
    private static final long F2 = f.a(127);
    private static final long G2 = f.a(85);
    private static final long H2 = f.a(86);
    private static final long I2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
    private static final long J2 = f.a(87);
    private static final long K2 = f.a(88);
    private static final long L2 = f.a(89);
    private static final long M2 = f.a(90);
    private static final long N2 = f.a(128);
    private static final long O2 = f.a(EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE);
    private static final long P2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
    private static final long Q2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
    private static final long R2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
    private static final long S2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
    private static final long T2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
    private static final long U2 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
    private static final long V2 = f.a(91);
    private static final long W2 = f.a(164);
    private static final long X2 = f.a(165);
    private static final long Y2 = f.a(166);
    private static final long Z2 = f.a(167);

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    private static final long f112110a3 = f.a(168);

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    private static final long f112116b3 = f.a(169);

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    private static final long f112122c3 = f.a(170);

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final long f112128d3 = f.a(171);

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    private static final long f112134e3 = f.a(172);

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    private static final long f112140f3 = f.a(173);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final long f112146g3 = f.a(174);

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final long f112152h3 = f.a(175);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final long f112158i3 = f.a(176);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final long f112164j3 = f.a(177);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final long f112170k3 = f.a(178);

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final long f112176l3 = f.a(179);

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final long f112182m3 = f.a(180);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final long f112188n3 = f.a(181);

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final long f112194o3 = f.a(182);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final long f112200p3 = f.a(183);

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final long f112206q3 = f.a(184);

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final long f112212r3 = f.a(185);

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final long f112218s3 = f.a(186);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final long f112224t3 = f.a(187);

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final long f112230u3 = f.a(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE);

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final long f112236v3 = f.a(EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE);

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final long f112242w3 = f.a(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE);

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final long f112248x3 = f.a(EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE);

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final long f112254y3 = f.a(EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final long f112260z3 = f.a(EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
    private static final long A3 = f.a(EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
    private static final long B3 = f.a(211);
    private static final long C3 = f.a(EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE);
    private static final long D3 = f.a(EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE);
    private static final long E3 = f.a(EnumC4419g.SDK_ASSET_ICON_PIN_VALUE);
    private static final long F3 = f.a(EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
    private static final long G3 = f.a(EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
    private static final long H3 = f.a(EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE);
    private static final long I3 = f.a(EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE);
    private static final long J3 = f.a(EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
    private static final long K3 = f.a(EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
    private static final long L3 = f.a(EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE);
    private static final long M3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
    private static final long N3 = f.a(224);
    private static final long O3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
    private static final long P3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
    private static final long Q3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
    private static final long R3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
    private static final long S3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
    private static final long T3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
    private static final long U3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
    private static final long V3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
    private static final long W3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
    private static final long X3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
    private static final long Y3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
    private static final long Z3 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final long f112111a4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE);

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final long f112117b4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final long f112123c4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final long f112129d4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final long f112135e4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final long f112141f4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final long f112147g4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final long f112153h4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final long f112159i4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final long f112165j4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final long f112171k4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final long f112177l4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final long f112183m4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final long f112189n4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final long f112195o4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final long f112201p4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final long f112207q4 = f.a(255);

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final long f112213r4 = f.a(256);

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final long f112219s4 = f.a(EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final long f112225t4 = f.a(EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE);

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final long f112231u4 = f.a(EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final long f112237v4 = f.a(EnumC4419g.SDK_ASSET_HEADER_SHIELD_VALUE);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final long f112243w4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final long f112249x4 = f.a(EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final long f112255y4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final long f112261z4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
    private static final long A4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE);
    private static final long B4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
    private static final long C4 = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lt3/a$a;", "", "<init>", "()V", "Lt3/a;", "Back", "J", "a", "()J", "DirectionUp", "g", "DirectionDown", DateTokenConverter.CONVERTER_KEY, "DirectionLeft", "e", "DirectionRight", "f", "DirectionCenter", "c", "Tab", "m", "Enter", "h", "Backspace", "b", "Escape", IntegerTokenConverter.CONVERTER_KEY, "PageUp", "l", "PageDown", "k", "NumPadEnter", "j", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f112142g;
        }

        public final long b() {
            return a.H0;
        }

        public final long c() {
            return a.f112238w;
        }

        public final long d() {
            return a.f112220t;
        }

        public final long e() {
            return a.f112226u;
        }

        public final long f() {
            return a.f112232v;
        }

        public final long g() {
            return a.f112214s;
        }

        public final long h() {
            return a.G0;
        }

        public final long i() {
            return a.J0;
        }

        public final long j() {
            return a.A2;
        }

        public final long k() {
            return a.f112192o1;
        }

        public final long l() {
            return a.f112186n1;
        }

        public final long m() {
            return a.B0;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(long j11) {
        this.keyCode = j11;
    }

    public static final /* synthetic */ a n(long j11) {
        return new a(j11);
    }

    public static boolean p(long j11, Object obj) {
        return (obj instanceof a) && j11 == ((a) obj).getKeyCode();
    }

    public static final boolean q(long j11, long j12) {
        return j11 == j12;
    }

    public static int r(long j11) {
        return Long.hashCode(j11);
    }

    public static String s(long j11) {
        return "Key code: " + j11;
    }

    public boolean equals(Object obj) {
        return p(this.keyCode, obj);
    }

    public int hashCode() {
        return r(this.keyCode);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ long getKeyCode() {
        return this.keyCode;
    }

    public String toString() {
        return s(this.keyCode);
    }

    public static long o(long j11) {
        return j11;
    }
}
