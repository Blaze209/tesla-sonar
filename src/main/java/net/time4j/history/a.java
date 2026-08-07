package net.time4j.history;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f94555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f94556d = h.g(j.AD, 8, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f94557e = h.g(j.BC, 45, 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f94558f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f94559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f94560b;

    /* JADX INFO: renamed from: net.time4j.history.a$a, reason: collision with other inner class name */
    class C2013a implements b {
        C2013a() {
        }

        private int a(int i11, int i12) {
            switch (i12) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return c(i11) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException("Invalid month: " + i12);
            }
        }

        private int b(h hVar) {
            return hVar.c().annoDomini(hVar.e());
        }

        private boolean c(int i11) {
            return Arrays.binarySearch(a.this.f94559a, i11) >= 0;
        }

        @Override // net.time4j.history.b
        public h fromMJD(long j11) {
            long j12 = -676021;
            if (j11 >= -676021) {
                return c.JULIAN.fromMJD(j11);
            }
            int i11 = 7;
            while (i11 >= -44) {
                j12 -= c(i11) ? 366L : 365L;
                if (j12 <= j11) {
                    int i12 = 1;
                    while (i12 <= 12) {
                        long jA = ((long) a(i11, i12)) + j12;
                        if (jA > j11) {
                            j jVar = i11 <= 0 ? j.BC : j.AD;
                            if (i11 <= 0) {
                                i11 = 1 - i11;
                            }
                            return h.g(jVar, i11, i12, (int) ((j11 - j12) + 1));
                        }
                        i12++;
                        j12 = jA;
                    }
                }
                i11--;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + j11);
        }

        @Override // net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            if (hVar.compareTo(a.f94556d) >= 0) {
                return c.JULIAN.getMaximumDayOfMonth(hVar);
            }
            if (hVar.compareTo(a.f94557e) >= 0) {
                return a(b(hVar), hVar.d());
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
        }

        @Override // net.time4j.history.b
        public boolean isValid(h hVar) {
            int iB;
            if (hVar != null && (iB = b(hVar)) >= -44) {
                if (iB >= 8) {
                    return c.JULIAN.isValid(hVar);
                }
                if (hVar.b() <= a(iB, hVar.d())) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.history.b
        public long toMJD(h hVar) {
            if (hVar.compareTo(a.f94556d) >= 0) {
                return c.JULIAN.toMJD(hVar);
            }
            if (hVar.compareTo(a.f94557e) < 0) {
                throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
            }
            int iB = b(hVar);
            long jA = -676021;
            for (int i11 = 7; i11 >= iB; i11--) {
                jA -= c(i11) ? 366L : 365L;
            }
            for (int i12 = 1; i12 < hVar.d(); i12++) {
                jA += (long) a(iB, i12);
            }
            return (jA + ((long) hVar.b())) - 1;
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        f94555c = iArr;
        f94558f = new a(iArr);
    }

    private a(int... iArr) {
        int i11;
        int[] iArr2 = new int[iArr.length];
        int i12 = 0;
        while (true) {
            i11 = 1;
            if (i12 >= iArr.length) {
                break;
            }
            iArr2[i12] = 1 - iArr[i12];
            i12++;
        }
        Arrays.sort(iArr2);
        this.f94559a = iArr2;
        if (iArr2.length == 0) {
            throw new IllegalArgumentException("Missing leap years.");
        }
        int i13 = iArr2[0];
        if (i13 < -44 || iArr2[iArr2.length - 1] >= 8) {
            throw new IllegalArgumentException("Out of range: " + Arrays.toString(iArr));
        }
        while (i11 < iArr.length) {
            int i14 = iArr2[i11];
            if (i14 == i13) {
                throw new IllegalArgumentException("Contains duplicates: " + Arrays.toString(iArr));
            }
            i11++;
            i13 = i14;
        }
        this.f94560b = new C2013a();
    }

    public static a f(int... iArr) {
        return Arrays.equals(iArr, f94555c) ? f94558f : new a(iArr);
    }

    b d() {
        return this.f94560b;
    }

    int[] e() {
        return this.f94559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f94559a == ((a) obj).f94559a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f94559a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f94559a.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = 1 - this.f94559a[i11];
            if (i12 > 0) {
                sb2.append("BC ");
                sb2.append(i12);
            } else {
                sb2.append("AD ");
                sb2.append(this.f94559a[i11]);
            }
        }
        return sb2.toString();
    }
}
