package io.sentry.android.core.internal.threaddump;

import io.sentry.b7;
import io.sentry.c7;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.d0;
import io.sentry.q7;
import io.sentry.u7;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f79464f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f79465g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f79466h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f79467i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f79468j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f79469k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f79470l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f79471m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f79472n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f79473o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f79474p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f79475q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f79476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f79477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7 f79478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, DebugImage> f79479d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<d0> f79480e = new ArrayList();

    public c(q7 q7Var, boolean z11) {
        this.f79476a = q7Var;
        this.f79477b = z11;
        this.f79478c = new u7(q7Var);
    }

    private static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    private void b(d0 d0Var, c7 c7Var) {
        Map<String, c7> mapK = d0Var.k();
        if (mapK == null) {
            mapK = new HashMap<>();
        }
        c7 c7Var2 = mapK.get(c7Var.f());
        if (c7Var2 != null) {
            c7Var2.l(Math.max(c7Var2.g(), c7Var.g()));
        } else {
            mapK.put(c7Var.f(), new c7(c7Var));
        }
        d0Var.t(mapK);
    }

    private Integer d(Matcher matcher, int i11, Integer num) {
        String strGroup = matcher.group(i11);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long e(Matcher matcher, int i11, Long l11) {
        String strGroup = matcher.group(i11);
        return (strGroup == null || strGroup.length() == 0) ? l11 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer g(Matcher matcher, int i11, Integer num) {
        String strGroup = matcher.group(i11);
        if (strGroup != null && strGroup.length() != 0) {
            int i12 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean h(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private c0 j(b bVar, d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f79466h.matcher("");
        Matcher matcher2 = f79467i.matcher("");
        Matcher matcher3 = f79468j.matcher("");
        Matcher matcher4 = f79469k.matcher("");
        Matcher matcher5 = f79471m.matcher("");
        Matcher matcher6 = f79470l.matcher("");
        Matcher matcher7 = f79473o.matcher("");
        Matcher matcher8 = f79472n.matcher("");
        Matcher matcher9 = f79474p.matcher("");
        Matcher matcher10 = f79475q.matcher("");
        b0 b0Var = null;
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f79476a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f79459b;
            matcher10 = matcher10;
            if (h(matcher2, str)) {
                b0Var = new b0();
                String str2 = String.format("%s.%s", matcher2.group(1), matcher2.group(2));
                b0Var.D(str2);
                b0Var.y(matcher2.group(3));
                b0Var.x(matcher2.group(4));
                b0Var.B(g(matcher2, 5, null));
                b0Var.z(this.f79478c.b(str2));
                arrayList.add(b0Var);
                matcher2 = matcher2;
            } else {
                if (h(matcher, str)) {
                    b0 b0Var2 = new b0();
                    b0Var2.F(matcher.group(3));
                    b0Var2.y(matcher.group(6));
                    b0Var2.B(d(matcher, 7, null));
                    b0Var2.A("0x" + matcher.group(2));
                    b0Var2.G("native");
                    String strGroup = matcher.group(8);
                    String strA = strGroup == null ? null : a(strGroup);
                    if (strA != null) {
                        if (!this.f79479d.containsKey(strA)) {
                            DebugImage debugImage = new DebugImage();
                            debugImage.setDebugId(strA);
                            debugImage.setType("elf");
                            debugImage.setCodeFile(matcher.group(4));
                            debugImage.setCodeId(strGroup);
                            this.f79479d.put(strA, debugImage);
                        }
                        b0Var2.w("rel:" + strA);
                    } else {
                        matcher2 = matcher2;
                    }
                    arrayList.add(b0Var2);
                    b0Var = null;
                } else {
                    matcher2 = matcher2;
                    if (h(matcher3, str)) {
                        b0Var = new b0();
                        String str3 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                        b0Var.D(str3);
                        b0Var.y(matcher3.group(3));
                        b0Var.z(this.f79478c.b(str3));
                        b0Var.E(Boolean.TRUE);
                        arrayList.add(b0Var);
                    } else if (h(matcher4, str)) {
                        if (b0Var != null) {
                            c7 c7Var = new c7();
                            c7Var.l(1);
                            c7Var.h(matcher4.group(1));
                            c7Var.j(matcher4.group(2));
                            c7Var.i(matcher4.group(3));
                            b0Var.C(c7Var);
                            b(d0Var, c7Var);
                        }
                    } else if (h(matcher5, str)) {
                        if (b0Var != null) {
                            c7 c7Var2 = new c7();
                            c7Var2.l(2);
                            c7Var2.h(matcher5.group(1));
                            c7Var2.j(matcher5.group(2));
                            c7Var2.i(matcher5.group(3));
                            b0Var.C(c7Var2);
                            b(d0Var, c7Var2);
                        }
                    } else if (!h(matcher6, str)) {
                        if (!h(matcher7, str)) {
                            if (!h(matcher8, str)) {
                                if (!h(matcher9, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher10 = matcher10;
                                    if (h(matcher10, str)) {
                                        break;
                                    }
                                } else if (b0Var != null) {
                                    c7 c7Var3 = new c7();
                                    c7Var3.l(8);
                                    b0Var.C(c7Var3);
                                    b(d0Var, c7Var3);
                                }
                            } else if (b0Var != null) {
                                c7 c7Var4 = new c7();
                                c7Var4.l(8);
                                c7Var4.h(matcher8.group(1));
                                c7Var4.j(matcher8.group(2));
                                c7Var4.i(matcher8.group(3));
                                b0Var.C(c7Var4);
                                b(d0Var, c7Var4);
                            }
                        } else if (b0Var != null) {
                            c7 c7Var5 = new c7();
                            c7Var5.l(8);
                            c7Var5.h(matcher7.group(1));
                            c7Var5.j(matcher7.group(2));
                            c7Var5.i(matcher7.group(3));
                            c7Var5.k(e(matcher7, 4, null));
                            b0Var.C(c7Var5);
                            b(d0Var, c7Var5);
                        }
                        matcher10 = matcher10;
                    } else if (b0Var != null) {
                        c7 c7Var6 = new c7();
                        c7Var6.l(4);
                        c7Var6.h(matcher6.group(1));
                        c7Var6.j(matcher6.group(2));
                        c7Var6.i(matcher6.group(3));
                        b0Var.C(c7Var6);
                        b(d0Var, c7Var6);
                    }
                }
                matcher2 = matcher2;
            }
            matcher2 = matcher2;
        }
        Collections.reverse(arrayList);
        c0 c0Var = new c0(arrayList);
        c0Var.f(Boolean.TRUE);
        return c0Var;
    }

    private d0 k(b bVar) {
        d0 d0Var = new d0();
        Matcher matcher = f79464f.matcher("");
        Matcher matcher2 = f79465g.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z11 = false;
        if (aVarB == null) {
            this.f79476a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (h(matcher, aVarB.f79459b)) {
            Long lE = e(matcher, 4, null);
            if (lE == null) {
                this.f79476a.getLogger().c(b7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d0Var.u(lE);
            d0Var.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    d0Var.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    d0Var.z(strGroup);
                }
            }
        } else if (h(matcher2, aVarB.f79459b)) {
            Long lE2 = e(matcher2, 3, null);
            if (lE2 == null) {
                this.f79476a.getLogger().c(b7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d0Var.u(lE2);
            d0Var.w(matcher2.group(1));
        }
        String strM = d0Var.m();
        if (strM != null) {
            boolean zEquals = strM.equals("main");
            d0Var.v(Boolean.valueOf(zEquals));
            d0Var.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f79477b) {
                z11 = true;
            }
            d0Var.r(Boolean.valueOf(z11));
        }
        d0Var.y(j(bVar, d0Var));
        return d0Var;
    }

    public List<DebugImage> c() {
        return new ArrayList(this.f79479d.values());
    }

    public List<d0> f() {
        return this.f79480e;
    }

    public void i(b bVar) {
        Matcher matcher = f79464f.matcher("");
        Matcher matcher2 = f79465g.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f79476a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = aVarB.f79459b;
            if (h(matcher, str) || h(matcher2, str)) {
                bVar.d();
                d0 d0VarK = k(bVar);
                if (d0VarK != null) {
                    this.f79480e.add(d0VarK);
                }
            }
        }
    }
}
