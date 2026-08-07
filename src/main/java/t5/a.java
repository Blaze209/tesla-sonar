package t5;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2400a[] f112481a = {new C2400a(99, 99, -1, -1), new C2400a(35, 36, -1, -1), new C2400a(71, 72, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(85, 86, -1, -1), new C2400a(90, 96, -1, -1), new C2400a(80, 81, -1, -1), new C2400a(6, 6, -1, -1), new C2400a(20, 20, -1, -1), new C2400a(19, 19, -1, -1), new C2400a(32, 34, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(30, 31, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(50, 52, -1, -1), new C2400a(83, 83, -1, -1), new C2400a(60, 62, -1, -1), new C2400a(46, 47, -1, -1), new C2400a(66, 67, 73, -1), new C2400a(40, 42, -1, -1), new C2400a(70, 71, -1, -1), new C2400a(1, 2, -1, -1), new C2400a(20, 21, -1, -1), new C2400a(3, 4, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(48, 49, -1, -1), new C2400a(55, 56, -1, -1), new C2400a(63, 65, -1, -1), new C2400a(96, 96, -1, -1), new C2400a(38, 39, -1, -1), new C2400a(55, 56, -1, -1), new C2400a(27, 28, -1, -1), new C2400a(58, 58, -1, -1), new C2400a(68, 69, -1, -1), new C2400a(3, 4, -1, -1), new C2400a(7, 8, -1, -1), new C2400a(87, 88, 86, -1), new C2400a(88, 89, 96, -1), new C2400a(10, 14, 0, 6), new C2400a(43, 45, -1, -1), new C2400a(73, 74, -1, -1), new C2400a(97, 97, -1, -1), new C2400a(15, 19, -1, -1), new C2400a(6, 6, 0, 9), new C2400a(96, 96, -1, -1), new C2400a(2, 2, -1, -1), new C2400a(29, 29, -1, -1), new C2400a(57, 57, -1, -1), new C2400a(37, 38, -1, -1), new C2400a(75, 79, 87, 88), new C2400a(84, 84, -1, -1), new C2400a(22, 24, 20, -1), new C2400a(6, 9, -1, -1), new C2400a(5, 5, -1, -1), new C2400a(98, 99, -1, -1), new C2400a(53, 54, -1, -1), new C2400a(24, 26, -1, -1), new C2400a(82, 83, -1, -1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f112482b = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f112483c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f112484d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f112485e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f112486f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f112487g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    private static class C2400a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f112488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f112489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f112490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f112491d;

        C2400a(int i11, int i12, int i13, int i14) {
            this.f112488a = i11;
            this.f112489b = i12;
            this.f112490c = i13;
            this.f112491d = i14;
        }

        boolean a(String str) {
            int i11 = Integer.parseInt(str.substring(0, 2));
            return (this.f112488a <= i11 && i11 <= this.f112489b) || i11 == this.f112490c || i11 == this.f112491d;
        }
    }

    private static int a(String str, MatchResult matchResult) {
        int length;
        MatchResult matchResultG;
        int iEnd = matchResult.end();
        Matcher matcher = f112482b.matcher(str);
        String strGroup = "";
        int i11 = -1;
        int iEnd2 = -1;
        int i12 = 1;
        int i13 = 1;
        boolean z11 = true;
        boolean z12 = false;
        while (iEnd < str.length()) {
            if (!matcher.find(iEnd)) {
                length = str.length();
            } else if (matcher.end() - matcher.start() <= 25) {
                while (iEnd < matcher.start()) {
                    int i14 = iEnd + 1;
                    if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd)) != -1) {
                        i12++;
                    }
                    iEnd = i14;
                }
                if (i12 > 5 || (i13 = i13 + 1) > 14) {
                    break;
                }
                if (f(str, iEnd) == null) {
                    if (!d(matcher.group(0))) {
                        if (i13 == 5 && !z12) {
                            iEnd = matcher.end();
                            break;
                        }
                        if (z12 && i13 > 4 && (matchResultG = g(str, iEnd)) != null) {
                            if (strGroup.equals("et") && matchResultG.group(0).equals("al")) {
                                iEnd = matchResultG.end();
                                break;
                            }
                            Matcher matcher2 = f112482b.matcher(str);
                            if (!matcher2.find(matchResultG.end())) {
                                iEnd2 = matchResultG.end();
                            } else if (e(matcher2.group(0), matchResultG)) {
                                return matcher2.end();
                            }
                        }
                    } else {
                        z12 = true;
                    }
                    z11 = false;
                } else {
                    if (z11 && i12 > 1) {
                        return -iEnd;
                    }
                    if (i11 == -1) {
                        i11 = iEnd;
                    }
                }
                strGroup = matcher.group(0);
                iEnd = matcher.end();
            } else {
                length = matcher.end();
            }
            return -length;
        }
        if (iEnd2 > 0) {
            return iEnd2;
        }
        if (i11 <= 0) {
            i11 = iEnd;
        }
        return -i11;
    }

    private static boolean b(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (Character.isDigit(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 > 5) {
            return false;
        }
        Matcher matcher = f112486f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i13 = Integer.parseInt(matcher.group(1));
        if (i13 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i14 = i13 % 10;
        if (i14 == 1) {
            return lowerCase.equals(i13 % 100 != 11 ? "st" : "th");
        }
        if (i14 == 2) {
            return lowerCase.equals(i13 % 100 != 12 ? "nd" : "th");
        }
        if (i14 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i13 % 100 != 13 ? "rd" : "th");
    }

    static String c(String str) {
        Matcher matcher = f112483c.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (b(matcher.group(0))) {
                int iStart = matcher.start();
                int iA = a(str, matcher);
                if (iA > 0) {
                    return str.substring(iStart, iA);
                }
                iEnd = -iA;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    public static boolean d(String str) {
        return f112485e.matcher(str).matches();
    }

    private static boolean e(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (iGroupCount > 0) {
            int i11 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i11;
                break;
            }
            iGroupCount = i11;
        }
        return f112487g.matcher(str).matches() && f112481a[iGroupCount].a(str);
    }

    public static MatchResult f(String str, int i11) {
        if (i11 > 0 && ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i11 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f112483c.matcher(str).region(i11, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    public static MatchResult g(String str, int i11) {
        if (i11 > 0 && ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i11 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f112484d.matcher(str).region(i11, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }
}
