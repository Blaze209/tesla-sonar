package com.henninghall.date_picker;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f45186a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f45188b;

        static {
            int[] iArr = new int[ny.c.values().length];
            f45188b = iArr;
            try {
                iArr[ny.c.nativeAndroid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45188b[ny.c.iosClone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ny.b.values().length];
            f45187a = iArr2;
            try {
                iArr2[ny.b.datetime.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45187a[ny.b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45187a[ny.b.date.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    d(l lVar) {
        this.f45186a = lVar;
    }

    private ArrayList<ny.d> c() {
        String strReplaceAll = h.c(this.f45186a.y()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(ny.d.values()));
        ArrayList<ny.d> arrayList2 = new ArrayList<>();
        ny.d dVar = ny.d.DAY;
        arrayList.remove(dVar);
        arrayList2.add(dVar);
        for (char c11 : strReplaceAll.toCharArray()) {
            try {
                ny.d dVarI = m.i(c11);
                if (arrayList.contains(dVarI)) {
                    arrayList.remove(dVarI);
                    arrayList2.add(dVarI);
                }
            } catch (Exception unused) {
            }
        }
        ny.d dVar2 = ny.d.AM_PM;
        if (arrayList.contains(dVar2)) {
            arrayList.remove(dVar2);
            arrayList2.add(dVar2);
        }
        if (!arrayList.isEmpty()) {
            Log.e("RNDatePicker", arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
        }
        return arrayList2;
    }

    public String a() {
        Calendar calendarX = this.f45186a.x();
        return calendarX != null ? m.b(calendarX) : this.f45186a.w();
    }

    public ArrayList<ny.d> b() {
        ArrayList<ny.d> arrayListC = c();
        ArrayList<ny.d> arrayListF = f();
        ArrayList<ny.d> arrayList = new ArrayList<>();
        for (ny.d dVar : arrayListC) {
            if (arrayListF.contains(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public int d() {
        int i11 = a.f45188b[this.f45186a.I().ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? k.f45215a : k.f45215a;
        }
        return k.f45216b;
    }

    public int e() {
        int iIntValue = this.f45186a.t().intValue() / 35;
        return iIntValue % 2 == 0 ? iIntValue + 1 : iIntValue;
    }

    public ArrayList<ny.d> f() {
        ArrayList<ny.d> arrayList = new ArrayList<>();
        ny.b bVarD = this.f45186a.D();
        int i11 = a.f45187a[bVarD.ordinal()];
        if (i11 == 1) {
            arrayList.add(ny.d.DAY);
            arrayList.add(ny.d.HOUR);
            arrayList.add(ny.d.MINUTE);
        } else if (i11 == 2) {
            arrayList.add(ny.d.HOUR);
            arrayList.add(ny.d.MINUTE);
        } else if (i11 == 3) {
            arrayList.add(ny.d.YEAR);
            arrayList.add(ny.d.MONTH);
            arrayList.add(ny.d.DATE);
        }
        if ((bVarD == ny.b.time || bVarD == ny.b.datetime) && this.f45186a.f45233q.i()) {
            arrayList.add(ny.d.AM_PM);
        }
        return arrayList;
    }

    public boolean g() {
        return this.f45186a.I() == ny.c.nativeAndroid;
    }

    public boolean h() {
        return this.f45186a.D() == ny.b.time && !i();
    }

    public boolean i() {
        return this.f45186a.v() == ny.a.locale ? h.i(this.f45186a.y()) : m.c();
    }
}
