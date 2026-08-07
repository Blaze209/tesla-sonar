package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class F3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static F3 f25721d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static F3 f25723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static F3 f25724g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static F3 f25726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static F3 f25727j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f25728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F3 f25719b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F3 f25720c = new F3((HashMap) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static F3 f25722e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static F3 f25725h = null;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f25729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25730b;

        public a(String str, int i11) {
            this.f25729a = str;
            this.f25730b = i11;
        }
    }

    static {
        f25721d = null;
        f25723f = null;
        f25724g = null;
        f25726i = null;
        f25727j = null;
        F3 f11 = new F3();
        f25721d = f11;
        f11.f25728a.put("liga", 1);
        f25721d.f25728a.put("clig", 1);
        f25721d.f25728a.put("dlig", 0);
        f25721d.f25728a.put("hlig", 0);
        f25721d.f25728a.put("calt", 1);
        F3 f12 = new F3();
        f25723f = f12;
        f12.f25728a.put("subs", 0);
        f25723f.f25728a.put("sups", 0);
        F3 f13 = new F3();
        f25724g = f13;
        f13.f25728a.put("smcp", 0);
        f25724g.f25728a.put("c2sc", 0);
        f25724g.f25728a.put("pcap", 0);
        f25724g.f25728a.put("c2pc", 0);
        f25724g.f25728a.put("unic", 0);
        f25724g.f25728a.put("titl", 0);
        F3 f14 = new F3();
        f25726i = f14;
        f14.f25728a.put("lnum", 0);
        f25726i.f25728a.put("onum", 0);
        f25726i.f25728a.put("pnum", 0);
        f25726i.f25728a.put("tnum", 0);
        f25726i.f25728a.put("frac", 0);
        f25726i.f25728a.put("afrc", 0);
        f25726i.f25728a.put("ordn", 0);
        f25726i.f25728a.put("zero", 0);
        F3 f15 = new F3();
        f25727j = f15;
        f15.f25728a.put("jp78", 0);
        f25727j.f25728a.put("jp83", 0);
        f25727j.f25728a.put("jp90", 0);
        f25727j.f25728a.put("jp04", 0);
        f25727j.f25728a.put("smpl", 0);
        f25727j.f25728a.put("trad", 0);
        f25727j.f25728a.put("fwid", 0);
        f25727j.f25728a.put("pwid", 0);
        f25727j.f25728a.put("ruby", 0);
    }

    public F3() {
        this.f25728a = new HashMap();
    }

    static F3 b(String str) {
        F3 f3B;
        if (str.equals("normal")) {
            return f25727j;
        }
        List listA = a(str);
        if (listA == null || (f3B = b(listA)) == null || f3B == f25720c || listA.size() > 0) {
            return null;
        }
        return f3B;
    }

    static F3 c(String str) {
        F3 f11 = new F3();
        SA sa2 = new SA(str);
        sa2.q();
        while (!sa2.c()) {
            a aVarA = a(sa2);
            if (aVarA == null) {
                return null;
            }
            f11.f25728a.put(aVarA.f25729a, Integer.valueOf(aVarA.f25730b));
            sa2.p();
        }
        return f11;
    }

    static DA.d d(String str) {
        str.getClass();
        switch (str) {
            case "normal":
                return DA.d.normal;
            case "auto":
                return DA.d.auto;
            case "none":
                return DA.d.none;
            default:
                return null;
        }
    }

    private static F3 e(List list) {
        F3 f11 = new F3(f25723f);
        int iA = a(list, "sub", "super");
        if (iA == 1) {
            f11.f25728a.put("subs", 1);
            return f11;
        }
        if (iA == 2) {
            f11.f25728a.put("sups", 1);
            return f11;
        }
        if (iA != 3) {
            return null;
        }
        return f25720c;
    }

    static F3 f(String str) {
        if (str.equals("normal")) {
            return f25721d;
        }
        if (str.equals("none")) {
            a();
            return f25722e;
        }
        List listA = a(str);
        if (listA == null) {
            return null;
        }
        a();
        F3 f3C = c(listA);
        if (f3C == null || f3C == f25720c || listA.size() > 0) {
            return null;
        }
        return f3C;
    }

    static F3 g(String str) {
        F3 f3D;
        if (str.equals("normal")) {
            return f25726i;
        }
        List listA = a(str);
        if (listA == null || (f3D = d(listA)) == null || f3D == f25720c || listA.size() > 0) {
            return null;
        }
        return f3D;
    }

    static F3 h(String str) {
        if (str.equals("normal")) {
            return f25723f;
        }
        F3 f11 = new F3(f25723f);
        if (str.equals("sub")) {
            f11.f25728a.put("subs", 1);
            return f11;
        }
        if (!str.equals("super")) {
            return null;
        }
        f11.f25728a.put("sups", 1);
        return f11;
    }

    public void a(F3 f11) {
        if (f11 == null) {
            return;
        }
        this.f25728a.putAll(f11.f25728a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f25728a.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append("'");
            sb2.append((String) entry.getKey());
            sb2.append("' ");
            sb2.append(entry.getValue());
        }
        return sb2.toString();
    }

    public void a(DA.d dVar) {
        if (dVar == DA.d.none) {
            this.f25728a.put("kern", 0);
        } else {
            this.f25728a.put("kern", 1);
        }
    }

    private F3(HashMap map) {
        this.f25728a = map;
    }

    public F3(F3 f11) {
        this.f25728a = new HashMap(f11.f25728a);
    }

    private static a a(SA sa2) {
        int iIntValue;
        sa2.q();
        String strJ = sa2.j();
        if (strJ == null || strJ.length() != 4) {
            return null;
        }
        sa2.q();
        if (sa2.c()) {
            iIntValue = 1;
        } else {
            iIntValue = 0;
            Integer numA = sa2.a(false);
            if (numA == null) {
                if (!sa2.a(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    sa2.a(DebugKt.DEBUG_PROPERTY_VALUE_ON);
                    iIntValue = 1;
                }
            } else {
                iIntValue = numA.intValue();
            }
        }
        return new a(strJ, iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7 A[RETURN] */
    private static F3 d(List list) {
        boolean z11;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        F3 f11 = new F3(f25726i);
        int iA5 = a(list, "lining-nums", "oldstyle-nums");
        boolean z12 = true;
        if (iA5 == 1) {
            f11.f25728a.put("lnum", 1);
        } else {
            if (iA5 == 2) {
                f11.f25728a.put("onum", 1);
            } else {
                if (iA5 == 3) {
                    return f25720c;
                }
                z11 = false;
            }
            iA = a(list, "proportional-nums", "tabular-nums");
            if (iA != 1) {
                f11.f25728a.put("pnum", 1);
            } else {
                if (iA != 2) {
                    f11.f25728a.put("tnum", 1);
                } else if (iA == 3) {
                    return f25720c;
                }
                iA2 = a(list, "diagonal-fractions", "stacked-fractions");
                if (iA2 != 1) {
                    f11.f25728a.put("frac", 1);
                } else {
                    if (iA2 != 2) {
                        f11.f25728a.put("afrc", 1);
                    } else if (iA2 == 3) {
                        return f25720c;
                    }
                    iA3 = a(list, "ordinal");
                    if (iA3 != 1) {
                        f11.f25728a.put("ordn", 1);
                        z11 = true;
                    } else if (iA3 == 2) {
                        return f25720c;
                    }
                    iA4 = a(list, "slashed-zero");
                    if (iA4 != 1) {
                        f11.f25728a.put("zero", 1);
                    } else {
                        if (iA4 != 2) {
                            return f25720c;
                        }
                        z12 = z11;
                    }
                    if (z12) {
                        return f11;
                    }
                    return null;
                }
                z11 = true;
                iA3 = a(list, "ordinal");
                if (iA3 != 1) {
                    f11.f25728a.put("ordn", 1);
                    z11 = true;
                } else if (iA3 == 2) {
                    return f25720c;
                }
                iA4 = a(list, "slashed-zero");
                if (iA4 != 1) {
                    f11.f25728a.put("zero", 1);
                } else {
                    if (iA4 != 2) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA2 = a(list, "diagonal-fractions", "stacked-fractions");
            if (iA2 != 1) {
                f11.f25728a.put("frac", 1);
            } else {
                if (iA2 != 2) {
                    f11.f25728a.put("afrc", 1);
                } else if (iA2 == 3) {
                    return f25720c;
                }
                iA3 = a(list, "ordinal");
                if (iA3 != 1) {
                    f11.f25728a.put("ordn", 1);
                    z11 = true;
                } else if (iA3 == 2) {
                    return f25720c;
                }
                iA4 = a(list, "slashed-zero");
                if (iA4 != 1) {
                    f11.f25728a.put("zero", 1);
                } else {
                    if (iA4 != 2) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA3 = a(list, "ordinal");
            if (iA3 != 1) {
                f11.f25728a.put("ordn", 1);
                z11 = true;
            } else if (iA3 == 2) {
                return f25720c;
            }
            iA4 = a(list, "slashed-zero");
            if (iA4 != 1) {
                f11.f25728a.put("zero", 1);
            } else {
                if (iA4 != 2) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA = a(list, "proportional-nums", "tabular-nums");
        if (iA != 1) {
            f11.f25728a.put("pnum", 1);
        } else {
            if (iA != 2) {
                f11.f25728a.put("tnum", 1);
            } else if (iA == 3) {
                return f25720c;
            }
            iA2 = a(list, "diagonal-fractions", "stacked-fractions");
            if (iA2 != 1) {
                f11.f25728a.put("frac", 1);
            } else {
                if (iA2 != 2) {
                    f11.f25728a.put("afrc", 1);
                } else if (iA2 == 3) {
                    return f25720c;
                }
                iA3 = a(list, "ordinal");
                if (iA3 != 1) {
                    f11.f25728a.put("ordn", 1);
                    z11 = true;
                } else if (iA3 == 2) {
                    return f25720c;
                }
                iA4 = a(list, "slashed-zero");
                if (iA4 != 1) {
                    f11.f25728a.put("zero", 1);
                } else {
                    if (iA4 != 2) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA3 = a(list, "ordinal");
            if (iA3 != 1) {
                f11.f25728a.put("ordn", 1);
                z11 = true;
            } else if (iA3 == 2) {
                return f25720c;
            }
            iA4 = a(list, "slashed-zero");
            if (iA4 != 1) {
                f11.f25728a.put("zero", 1);
            } else {
                if (iA4 != 2) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA2 = a(list, "diagonal-fractions", "stacked-fractions");
        if (iA2 != 1) {
            f11.f25728a.put("frac", 1);
        } else {
            if (iA2 != 2) {
                f11.f25728a.put("afrc", 1);
            } else if (iA2 == 3) {
                return f25720c;
            }
            iA3 = a(list, "ordinal");
            if (iA3 != 1) {
                f11.f25728a.put("ordn", 1);
                z11 = true;
            } else if (iA3 == 2) {
                return f25720c;
            }
            iA4 = a(list, "slashed-zero");
            if (iA4 != 1) {
                f11.f25728a.put("zero", 1);
            } else {
                if (iA4 != 2) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA3 = a(list, "ordinal");
        if (iA3 != 1) {
            f11.f25728a.put("ordn", 1);
            z11 = true;
        } else if (iA3 == 2) {
            return f25720c;
        }
        iA4 = a(list, "slashed-zero");
        if (iA4 != 1) {
            f11.f25728a.put("zero", 1);
        } else {
            if (iA4 != 2) {
                return f25720c;
            }
            z12 = z11;
        }
        if (z12) {
            return f11;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb A[RETURN] */
    private static F3 b(List list) {
        int iA;
        byte b11 = 1;
        F3 f11 = new F3(f25727j);
        String strA = a(list, "jis78", "jis83", "jis90", "jis04", "simplified", "traditional");
        if (strA != null) {
            switch (strA) {
                case "traditional":
                    f11.f25728a.put("trad", 1);
                    break;
                case "simplified":
                    f11.f25728a.put("smpl", 1);
                    break;
                case "ERR":
                    return f25720c;
                case "jis04":
                    f11.f25728a.put("jp04", 1);
                    break;
                case "jis78":
                    f11.f25728a.put("jp78", 1);
                    break;
                case "jis83":
                    f11.f25728a.put("jp83", 1);
                    break;
                case "jis90":
                    f11.f25728a.put("jp90", 1);
                    break;
                default:
                    break;
            }
        }
        int iA2 = a(list, "full-width", "proportional-width");
        if (iA2 == 1) {
            f11.f25728a.put("fwid", 1);
        } else {
            if (iA2 == 2) {
                f11.f25728a.put("pwid", 1);
            } else if (iA2 == 3) {
                return f25720c;
            }
            iA = a(list, "ruby");
            if (iA != 1) {
                f11.f25728a.put("ruby", 1);
            } else if (iA != 2) {
                return f25720c;
            }
            if (b11 != 0) {
                return f11;
            }
            return null;
        }
        iA = a(list, "ruby");
        if (iA != 1) {
            f11.f25728a.put("ruby", 1);
        } else if (iA != 2) {
            return f25720c;
        }
        if (b11 != 0) {
            return f11;
        }
        return null;
    }

    static F3 e(String str) {
        if (str.equals("normal")) {
            return f25724g;
        }
        F3 f11 = new F3(f25724g);
        if (a(f11, str)) {
            return f11;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[RETURN] */
    private static F3 c(List list) {
        int iA;
        int iA2;
        int iA3;
        a();
        F3 f11 = new F3(f25722e);
        boolean z11 = false;
        int iA4 = a(list, "common-ligatures", "no-common-ligatures");
        boolean z12 = true;
        if (iA4 == 1) {
            f11.a("clig", "liga", 1);
        } else {
            if (iA4 == 2) {
                f11.a("clig", "liga", 0);
            } else if (iA4 == 3) {
                return f25720c;
            }
            iA = a(list, "discretionary-ligatures", "no-discretionary-ligatures");
            if (iA != 1) {
                f11.f25728a.put("dlig", 1);
            } else {
                if (iA != 2) {
                    f11.f25728a.put("dlig", 0);
                } else if (iA == 3) {
                    return f25720c;
                }
                iA2 = a(list, "historical-ligatures", "no-historical-ligatures");
                if (iA2 != 1) {
                    f11.f25728a.put("hlig", 1);
                } else {
                    if (iA2 != 2) {
                        f11.f25728a.put("hlig", 0);
                    } else if (iA2 == 3) {
                        return f25720c;
                    }
                    iA3 = a(list, "contextual", "no-contextual");
                    if (iA3 != 1) {
                        f11.f25728a.put("calt", 1);
                    } else if (iA3 != 2) {
                        f11.f25728a.put("calt", 0);
                    } else {
                        if (iA3 != 3) {
                            return f25720c;
                        }
                        z12 = z11;
                    }
                    if (z12) {
                        return f11;
                    }
                    return null;
                }
                z11 = true;
                iA3 = a(list, "contextual", "no-contextual");
                if (iA3 != 1) {
                    f11.f25728a.put("calt", 1);
                } else if (iA3 != 2) {
                    f11.f25728a.put("calt", 0);
                } else {
                    if (iA3 != 3) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA2 = a(list, "historical-ligatures", "no-historical-ligatures");
            if (iA2 != 1) {
                f11.f25728a.put("hlig", 1);
            } else {
                if (iA2 != 2) {
                    f11.f25728a.put("hlig", 0);
                } else if (iA2 == 3) {
                    return f25720c;
                }
                iA3 = a(list, "contextual", "no-contextual");
                if (iA3 != 1) {
                    f11.f25728a.put("calt", 1);
                } else if (iA3 != 2) {
                    f11.f25728a.put("calt", 0);
                } else {
                    if (iA3 != 3) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA3 = a(list, "contextual", "no-contextual");
            if (iA3 != 1) {
                f11.f25728a.put("calt", 1);
            } else if (iA3 != 2) {
                f11.f25728a.put("calt", 0);
            } else {
                if (iA3 != 3) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA = a(list, "discretionary-ligatures", "no-discretionary-ligatures");
        if (iA != 1) {
            f11.f25728a.put("dlig", 1);
        } else {
            if (iA != 2) {
                f11.f25728a.put("dlig", 0);
            } else if (iA == 3) {
                return f25720c;
            }
            iA2 = a(list, "historical-ligatures", "no-historical-ligatures");
            if (iA2 != 1) {
                f11.f25728a.put("hlig", 1);
            } else {
                if (iA2 != 2) {
                    f11.f25728a.put("hlig", 0);
                } else if (iA2 == 3) {
                    return f25720c;
                }
                iA3 = a(list, "contextual", "no-contextual");
                if (iA3 != 1) {
                    f11.f25728a.put("calt", 1);
                } else if (iA3 != 2) {
                    f11.f25728a.put("calt", 0);
                } else {
                    if (iA3 != 3) {
                        return f25720c;
                    }
                    z12 = z11;
                }
                if (z12) {
                    return f11;
                }
                return null;
            }
            z11 = true;
            iA3 = a(list, "contextual", "no-contextual");
            if (iA3 != 1) {
                f11.f25728a.put("calt", 1);
            } else if (iA3 != 2) {
                f11.f25728a.put("calt", 0);
            } else {
                if (iA3 != 3) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA2 = a(list, "historical-ligatures", "no-historical-ligatures");
        if (iA2 != 1) {
            f11.f25728a.put("hlig", 1);
        } else {
            if (iA2 != 2) {
                f11.f25728a.put("hlig", 0);
            } else if (iA2 == 3) {
                return f25720c;
            }
            iA3 = a(list, "contextual", "no-contextual");
            if (iA3 != 1) {
                f11.f25728a.put("calt", 1);
            } else if (iA3 != 2) {
                f11.f25728a.put("calt", 0);
            } else {
                if (iA3 != 3) {
                    return f25720c;
                }
                z12 = z11;
            }
            if (z12) {
                return f11;
            }
            return null;
        }
        z11 = true;
        iA3 = a(list, "contextual", "no-contextual");
        if (iA3 != 1) {
            f11.f25728a.put("calt", 1);
        } else if (iA3 != 2) {
            f11.f25728a.put("calt", 0);
        } else {
            if (iA3 != 3) {
                return f25720c;
            }
            z12 = z11;
        }
        if (z12) {
            return f11;
        }
        return null;
    }

    private static List a(String str) {
        SA sa2 = new SA(str);
        sa2.q();
        if (sa2.c()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!sa2.c()) {
            arrayList.add(sa2.k());
            sa2.q();
        }
        return arrayList;
    }

    private static int a(List list, String str, String str2) {
        if (list.remove(str)) {
            return (list.contains(str) || list.contains(str2)) ? 3 : 1;
        }
        if (list.remove(str2)) {
            return list.contains(str2) ? 3 : 2;
        }
        return 0;
    }

    private static final F3 b() {
        F3 f11 = new F3();
        f11.f25728a.put("rlig", 1);
        f11.f25728a.put("liga", 1);
        f11.f25728a.put("clig", 1);
        f11.f25728a.put("calt", 1);
        f11.f25728a.put("locl", 1);
        f11.f25728a.put("ccmp", 1);
        f11.f25728a.put("mark", 1);
        f11.f25728a.put("mkmk", 1);
        return f11;
    }

    private static int a(List list, String str) {
        if (list.remove(str)) {
            return list.contains(str) ? 2 : 1;
        }
        return 0;
    }

    private static String a(List list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return "ERR";
            }
        }
        return str;
    }

    static F3 c() {
        if (f25725h == null) {
            F3 f11 = new F3();
            f25725h = f11;
            f11.f25728a.put("smcp", 1);
            f25725h.f25728a.put("c2sc", 0);
            f25725h.f25728a.put("pcap", 0);
            f25725h.f25728a.put("c2pc", 0);
            f25725h.f25728a.put("unic", 0);
            f25725h.f25728a.put("titl", 0);
        }
        return f25725h;
    }

    private void a(String str, String str2, int i11) {
        this.f25728a.put(str, Integer.valueOf(i11));
        this.f25728a.put(str2, Integer.valueOf(i11));
    }

    private static boolean a(F3 f11, String str) {
        str.getClass();
        switch (str) {
            case "titling-caps":
                f11.f25728a.put("titl", 1);
                return true;
            case "all-small-caps":
                f11.a("smcp", "c2sc", 1);
                return true;
            case "unicase":
                f11.f25728a.put("unic", 1);
                return true;
            case "petite-caps":
                f11.f25728a.put("pcap", 1);
                return true;
            case "all-petite-caps":
                f11.a("pcap", "c2pc", 1);
                return true;
            case "small-caps":
                f11.f25728a.put("smcp", 1);
                return true;
            default:
                return false;
        }
    }

    private static F3 a(List list) {
        F3 f11 = new F3(f25724g);
        String strA = a(list, "small-caps", "all-small-caps", "petite-caps", "all-petite-caps", "unicase", "titling-caps");
        if (strA == "ERR") {
            return f25720c;
        }
        if (strA == null) {
            return null;
        }
        a(f11, strA);
        return f11;
    }

    static void a(DA da2, String str) {
        F3 f3C;
        F3 f11;
        F3 f3E;
        F3 f3A;
        F3 f3D;
        if (str.equals("normal")) {
            da2.R = f25721d;
            da2.S = f25723f;
            da2.T = f25724g;
            da2.U = f25726i;
            da2.V = f25727j;
            da2.f25322a |= 34084860461056L;
            return;
        }
        if (str.equals("none")) {
            a();
            da2.R = f25722e;
            da2.S = f25723f;
            da2.T = f25724g;
            da2.U = f25726i;
            da2.V = f25727j;
            da2.f25322a |= 34084860461056L;
            return;
        }
        List listA = a(str);
        if (listA == null || (f3C = c(listA)) == (f11 = f25720c)) {
            return;
        }
        F3 f3B = null;
        if (listA.size() > 0) {
            f3E = e(listA);
            if (f3E == f11) {
                return;
            }
        } else {
            f3E = null;
        }
        if (listA.size() > 0) {
            f3A = a(listA);
            if (f3A == f11) {
                return;
            }
        } else {
            f3A = null;
        }
        if (listA.size() > 0) {
            f3D = d(listA);
            if (f3D == f11) {
                return;
            }
        } else {
            f3D = null;
        }
        if (listA.size() <= 0 || (f3B = b(listA)) != f11) {
            if (f3C != null) {
                da2.R = f3C;
                da2.f25322a |= 1099511627776L;
            }
            if (f3E != null) {
                da2.S = f3E;
                da2.f25322a |= 2199023255552L;
            }
            if (f3A != null) {
                da2.T = f3A;
                da2.f25322a |= 4398046511104L;
            }
            if (f3D != null) {
                da2.U = f3D;
                da2.f25322a |= 8796093022208L;
            }
            if (f3B != null) {
                da2.V = f3B;
                da2.f25322a |= 17592186044416L;
            }
        }
    }

    private static void a() {
        if (f25722e != null) {
            return;
        }
        F3 f11 = new F3();
        f11.f25728a.put("liga", 0);
        f11.f25728a.put("clig", 0);
        f11.f25728a.put("dlig", 0);
        f11.f25728a.put("hlig", 0);
        f11.f25728a.put("calt", 0);
        f25722e = f11;
    }
}
