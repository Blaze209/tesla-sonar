package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i11, int i12) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i11));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i12);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:523:?, LOOP_START, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0460  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x062b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0653  */
    /* JADX WARN: Code duplicated, block: B:267:0x0662  */
    /* JADX WARN: Code duplicated, block: B:278:0x0691 A[LOOP:3: B:255:0x062d->B:278:0x0691, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0694  */
    /* JADX WARN: Code duplicated, block: B:296:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:300:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:306:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:312:0x071e  */
    /* JADX WARN: Code duplicated, block: B:314:0x074b A[LOOP:5: B:310:0x0718->B:314:0x074b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0767  */
    /* JADX WARN: Code duplicated, block: B:322:0x077c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0784  */
    /* JADX WARN: Code duplicated, block: B:328:0x0793  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:334:0x07df A[Catch: all -> 0x0810, SQLiteException -> 0x0820, LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_START, PHI: r4 r8
      0x07df: PHI (r4v39 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v43 java.util.Iterator) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE]
      0x07df: PHI (r8v49 java.lang.String) = (r8v46 java.lang.String), (r8v51 java.lang.String) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0820, blocks: (B:332:0x07d9, B:334:0x07df, B:335:0x07e4, B:337:0x07f5), top: B:439:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0805  */
    /* JADX WARN: Code duplicated, block: B:345:0x0816  */
    /* JADX WARN: Code duplicated, block: B:356:0x0847 A[LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x084e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0854 A[PHI: r0 r13 r36
      0x0854: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x0885  */
    /* JADX WARN: Code duplicated, block: B:380:0x0895  */
    /* JADX WARN: Code duplicated, block: B:384:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:387:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:389:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:391:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:393:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:395:0x0928  */
    /* JADX WARN: Code duplicated, block: B:398:0x0932  */
    /* JADX WARN: Code duplicated, block: B:407:0x097d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0986  */
    /* JADX WARN: Code duplicated, block: B:412:0x0999 A[PHI: r16 r37 r40
      0x0999: PHI (r16v8 java.lang.String) = (r16v9 java.lang.String), (r2v25 java.lang.String) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v5 java.util.Map) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r40v3 androidx.collection.a) = (r40v4 androidx.collection.a), (r3v31 androidx.collection.a) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:417:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:490:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x068c A[EDGE_INSN: B:496:0x068c->B:277:0x068c BREAK  A[LOOP:3: B:255:0x062d->B:278:0x0691], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x06ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0842 A[EDGE_INSN: B:508:0x0842->B:355:0x0842 BREAK  A[LOOP:7: B:334:0x07df->B:356:0x0847], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x099e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0991 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0969 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x056f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x047f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0328 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:564:0x020d A[EDGE_INSN: B:564:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final List zzb(String str, List list, List list2, Long l11, Long l12, boolean z11) throws Throwable {
        int i11;
        int i12;
        boolean z12;
        Map map;
        Cursor cursor;
        boolean z13;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        androidx.collection.a aVar;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list3;
        int i13;
        boolean z14;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        String str3;
        Map aVar2;
        SQLiteDatabase sQLiteDatabaseZze;
        ?? r11;
        Cursor cursorRawQuery;
        androidx.collection.a aVar3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        zzav zzavVarZzj;
        String str7;
        ContentValues contentValues;
        androidx.collection.a aVar4;
        Iterator it4;
        String strZzc;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zZzd;
        Map map6;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf2;
        zzac zzacVar;
        Integer numValueOf3;
        zzav zzavVarZzj2;
        String str8;
        androidx.collection.a aVar5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        zzz zzzVar;
        androidx.collection.a aVar6;
        Iterator it7;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbc zzbcVarZzaf;
        long j11;
        String strZzd;
        Map map7;
        zzbc zzbcVar;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zZzd2;
        Map map8;
        Iterator it10;
        long j12;
        zzaa zzaaVar;
        zzav zzavVarZzj3;
        String str10;
        androidx.collection.a aVar7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        androidx.collection.a aVar8;
        int i14;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new androidx.collection.a();
        this.zzd = l11;
        this.zze = l12;
        Iterator it11 = list.iterator();
        while (true) {
            i11 = 0;
            i12 = 1;
            if (!it11.hasNext()) {
                z12 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it11.next()).zzd())) {
                z12 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z12) {
            zzav zzavVarZzj4 = this.zzg.zzj();
            String str12 = this.zza;
            zzavVarZzj4.zzaw();
            zzavVarZzj4.zzg();
            Preconditions.checkNotEmpty(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzavVarZzj4.zze().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e11) {
                zzavVarZzj4.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str12), e11);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "data";
        String str14 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj5 = this.zzg.zzj();
            String str15 = this.zza;
            Preconditions.checkNotEmpty(str15);
            androidx.collection.a aVar9 = new androidx.collection.a();
            try {
                cursorQuery4 = zzavVarZzj5.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i12))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i11));
                                        List list7 = (List) aVar9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e12) {
                                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str15), e12);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i11 = 0;
                                i12 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            cursorQuery4.close();
                            map = map9;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str15), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        zzav zzavVarZzj6 = this.zzg.zzj();
                        String str16 = this.zza;
                        zzavVarZzj6.zzaw();
                        zzavVarZzj6.zzg();
                        Preconditions.checkNotEmpty(str16);
                        cursorQuery = zzavVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str16}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new androidx.collection.a();
                                    while (true) {
                                        i14 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i14), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                                            z13 = z12;
                                            str2 = str13;
                                        } catch (IOException e14) {
                                            z13 = z12;
                                            str2 = str13;
                                            try {
                                                zzavVarZzj6.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str16), Integer.valueOf(i14), e14);
                                            } catch (SQLiteException e15) {
                                                e = e15;
                                                str14 = str14;
                                                zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str16), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z13) {
                                                        String str17 = this.zza;
                                                        zzav zzavVarZzj7 = this.zzg.zzj();
                                                        str3 = this.zza;
                                                        zzavVarZzj7.zzaw();
                                                        zzavVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str3);
                                                        aVar2 = new androidx.collection.a();
                                                        sQLiteDatabaseZze = zzavVarZzj7.zze();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e16) {
                                                                    e = e16;
                                                                    zzavVarZzj7.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str3), e);
                                                                    aVar2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str17);
                                                                    Preconditions.checkNotNull(map2);
                                                                    aVar3 = new androidx.collection.a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                            list4 = (List) aVar2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = aVar2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            aVar3.put(num, zziiVar3);
                                                                            aVar2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = aVar3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new androidx.collection.a();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                                                if (zzhqVar.zza()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhqVar.zzb());
                                                                                    if (zzhqVar.zzc()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        androidx.collection.a aVar10 = new androidx.collection.a();
                                                                        if (zziiVar != null) {
                                                                            it = zziiVar.zzg().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                if (!zzikVar.zza()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zziiVar2 = zziiVar;
                                                                        if (zziiVar2 != null) {
                                                                            i13 = 0;
                                                                            while (i13 < zziiVar2.zzb() * 64) {
                                                                                if (zzpk.zzn(zziiVar2.zza(), i13)) {
                                                                                    z14 = zZzp;
                                                                                    this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i13));
                                                                                    bitSet2.set(i13);
                                                                                    if (zzpk.zzn(zziiVar2.zzc(), i13)) {
                                                                                        bitSet.set(i13);
                                                                                    }
                                                                                    i13++;
                                                                                    zZzp = z14;
                                                                                } else {
                                                                                    z14 = zZzp;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i13));
                                                                                i13++;
                                                                                zZzp = z14;
                                                                            }
                                                                        }
                                                                        boolean z15 = zZzp;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                                        if (!zZzp2) {
                                                                        }
                                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str14 = str14;
                                                                        map2 = map2;
                                                                        zZzp = z15;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str14;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        aVar6 = new androidx.collection.a();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                                                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                            if (zzhsVarZza != null) {
                                                                                zzpgVar = this.zzg;
                                                                                zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                                                zzpgVar.zzj().zzh(zzbcVarZzaf);
                                                                                if (z11) {
                                                                                    continue;
                                                                                } else {
                                                                                    j11 = zzbcVarZzaf.zzc;
                                                                                    strZzd = zzhsVarZza.zzd();
                                                                                    map7 = (Map) aVar6.get(strZzd);
                                                                                    if (map7 == null) {
                                                                                        zzavVarZzj3 = zzpgVar.zzj();
                                                                                        str10 = this.zza;
                                                                                        zzavVarZzj3.zzaw();
                                                                                        zzavVarZzj3.zzg();
                                                                                        Preconditions.checkNotEmpty(str10);
                                                                                        Preconditions.checkNotEmpty(strZzd);
                                                                                        aVar7 = new androidx.collection.a();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = zzavVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                zzbcVar = zzbcVarZzaf;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbc();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    aVar7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e17) {
                                                                                                                                    e = e17;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str11), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                        th = th2;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    th = th3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(zzffVar2);
                                                                                                                        } catch (IOException e18) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str11), e18);
                                                                                                                        }
                                                                                                                        if (!cursor4.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        cursorQuery3 = cursor4;
                                                                                                                    } catch (SQLiteException e19) {
                                                                                                                        e = e19;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursor4.close();
                                                                                                                map7 = aVar7;
                                                                                                            } else {
                                                                                                                zzbcVar = zzbcVarZzaf;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery3.close();
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                        }
                                                                                                    } catch (SQLiteException e21) {
                                                                                                        e = e21;
                                                                                                        cursor4 = cursorQuery3;
                                                                                                        zzbcVar = zzbcVarZzaf;
                                                                                                    }
                                                                                                } catch (SQLiteException e22) {
                                                                                                    e = e22;
                                                                                                    zzbcVar = zzbcVarZzaf;
                                                                                                    cursor3 = null;
                                                                                                    zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    aVar6.put(strZzd, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.zzb.contains(num2)) {
                                                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zZzd2 = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j12 = j11;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar3);
                                                                                                                j12 = j11;
                                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar3.zzb()));
                                                                                                                if (!zZzd2) {
                                                                                                                    this.zzb.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                                j11 = j12;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zZzd2) {
                                                                                                                this.zzb.add(num2);
                                                                                                            }
                                                                                                            j11 = j12;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    zzzVar = zzzVar;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e23) {
                                                                                            e = e23;
                                                                                            str11 = str10;
                                                                                        }
                                                                                        aVar6.put(strZzd, map7);
                                                                                    } else {
                                                                                        zzbcVar = zzbcVarZzaf;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.zzb.contains(num2)) {
                                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zZzd2 = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j12 = j11;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                                                                                j12 = j11;
                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar4.zzb()));
                                                                                                if (!zZzd2) {
                                                                                                    this.zzb.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                j11 = j12;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zZzd2) {
                                                                                                this.zzb.add(num2);
                                                                                            }
                                                                                            j11 = j12;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    zzzVar = zzzVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z11) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        aVar4 = new androidx.collection.a();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                                                            strZzc = zziuVar.zzc();
                                                                            map5 = (Map) aVar4.get(strZzc);
                                                                            if (map5 == null) {
                                                                                zzavVarZzj2 = this.zzg.zzj();
                                                                                str8 = this.zza;
                                                                                zzavVarZzj2.zzaw();
                                                                                zzavVarZzj2.zzg();
                                                                                Preconditions.checkNotEmpty(str8);
                                                                                Preconditions.checkNotEmpty(strZzc);
                                                                                aVar5 = new androidx.collection.a();
                                                                                try {
                                                                                    cursorQuery2 = zzavVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) aVar5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                aVar5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e24) {
                                                                                                                e = e24;
                                                                                                                str9 = str8;
                                                                                                                zzavVarZzj2.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                aVar4.put(strZzc, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zZzd = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                                                                            zzicVar = this.zzu;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                                                                                zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                                                                                                                                if (zzfnVar.zza()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                                                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                                            }
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                            }
                                                                                                                            zzgs zzgsVarZze = zzicVar.zzaV().zze();
                                                                                                                            Object objZzl = zzgu.zzl(this.zza);
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                                numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf2));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                        }
                                                                                                                        if (!zZzd) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                        zzc(num4).zza(zzacVar);
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(zzfnVar2);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e25) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        zzavVarZzj2.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str9), e25);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e26) {
                                                                                                        e = e26;
                                                                                                        zzavVarZzj2.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = aVar5;
                                                                                            } else {
                                                                                                it5 = it4;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        } catch (SQLiteException e27) {
                                                                                            e = e27;
                                                                                            it5 = it4;
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        cursor2 = cursorQuery2;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e28) {
                                                                                    e = e28;
                                                                                    it5 = it4;
                                                                                    str9 = str8;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cursor2 = null;
                                                                                }
                                                                                aVar4.put(strZzc, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zZzd = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                                        zzicVar = this.zzu;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                                            zzgs zzgsVarZzk2 = zzicVar.zzaV().zzk();
                                                                                            if (zzfnVar.zza()) {
                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                            zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                        }
                                                                                        if (zzfnVar.zza()) {
                                                                                        }
                                                                                        zzgs zzgsVarZze2 = zzicVar.zzaV().zze();
                                                                                        Object objZzl2 = zzgu.zzl(this.zza);
                                                                                        if (zzfnVar.zza()) {
                                                                                            numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf2));
                                                                                        this.zzb.add(num4);
                                                                                        map5 = map6;
                                                                                        aVar4 = aVar4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        aVar4 = aVar4;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                    zzc(num4).zza(zzacVar);
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue4);
                                                                        arrayList2.add(zzhgVarZzb);
                                                                        zzavVarZzj = this.zzg.zzj();
                                                                        str7 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                                        zzavVarZzj.zzaw();
                                                                        zzavVarZzj.zzg();
                                                                        Preconditions.checkNotEmpty(str7);
                                                                        Preconditions.checkNotNull(zziiVarZzc);
                                                                        byte[] bArrZzcc = zziiVarZzc.zzcc();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrZzcc);
                                                                        try {
                                                                            try {
                                                                                if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                                                                                }
                                                                            } catch (SQLiteException e29) {
                                                                                e = e29;
                                                                                zzavVarZzj.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e31) {
                                                                            e = e31;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r11 = sQLiteDatabaseZze;
                                                                if (r11 != 0) {
                                                                    r11.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e32) {
                                                            e = e32;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            r11 = 0;
                                                            if (r11 != 0) {
                                                                r11.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        Preconditions.checkNotEmpty(str17);
                                                        Preconditions.checkNotNull(map2);
                                                        aVar3 = new androidx.collection.a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                list4 = (List) aVar2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = aVar2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                aVar3.put(num, zziiVar3);
                                                                aVar2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = aVar3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new androidx.collection.a();
                                                        if (zziiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhqVar.zza()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhqVar.zzb());
                                                                    if (zzhqVar.zzc()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        androidx.collection.a aVar11 = new androidx.collection.a();
                                                        if (zziiVar != null) {
                                                            it = zziiVar.zzg().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                if (!zzikVar.zza()) {
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        if (zziiVar2 != null) {
                                                            i13 = 0;
                                                            while (i13 < zziiVar2.zzb() * 64) {
                                                                if (zzpk.zzn(zziiVar2.zza(), i13)) {
                                                                    z14 = zZzp;
                                                                    this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i13));
                                                                    bitSet2.set(i13);
                                                                    if (zzpk.zzn(zziiVar2.zzc(), i13)) {
                                                                        bitSet.set(i13);
                                                                    }
                                                                    i13++;
                                                                    zZzp = z14;
                                                                } else {
                                                                    z14 = zZzp;
                                                                }
                                                                aVar.remove(Integer.valueOf(i13));
                                                                i13++;
                                                                zZzp = z14;
                                                            }
                                                        }
                                                        boolean z16 = zZzp;
                                                        com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                        if (!zZzp2) {
                                                        }
                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, aVar, aVar11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str14 = str14;
                                                        map2 = map2;
                                                        zZzp = z16;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str14;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    aVar6 = new androidx.collection.a();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                        if (zzhsVarZza != null) {
                                                            zzpgVar = this.zzg;
                                                            zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                            zzpgVar.zzj().zzh(zzbcVarZzaf);
                                                            if (z11) {
                                                                j11 = zzbcVarZzaf.zzc;
                                                                strZzd = zzhsVarZza.zzd();
                                                                map7 = (Map) aVar6.get(strZzd);
                                                                if (map7 == null) {
                                                                    zzavVarZzj3 = zzpgVar.zzj();
                                                                    str10 = this.zza;
                                                                    zzavVarZzj3.zzaw();
                                                                    zzavVarZzj3.zzg();
                                                                    Preconditions.checkNotEmpty(str10);
                                                                    Preconditions.checkNotEmpty(strZzd);
                                                                    aVar7 = new androidx.collection.a();
                                                                    str11 = str10;
                                                                    cursorQuery3 = zzavVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        zzbcVar = zzbcVarZzaf;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbc();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                aVar7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(zzffVar5);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map7 = aVar7;
                                                                    } else {
                                                                        zzbcVar = zzbcVarZzaf;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    aVar6.put(strZzd, map7);
                                                                } else {
                                                                    zzbcVar = zzbcVarZzaf;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.zzb.contains(num2)) {
                                                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zZzd2 = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j12 = j11;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar6);
                                                                            j12 = j11;
                                                                            zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar6.zzb()));
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(num2);
                                                                                break;
                                                                            }
                                                                            zzc(num2).zza(zzaaVar);
                                                                            j11 = j12;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zZzd2) {
                                                                            this.zzb.add(num2);
                                                                        }
                                                                        j11 = j12;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                zzzVar = zzzVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z11) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    aVar4 = new androidx.collection.a();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                                        strZzc = zziuVar2.zzc();
                                                        map5 = (Map) aVar4.get(strZzc);
                                                        if (map5 == null) {
                                                            zzavVarZzj2 = this.zzg.zzj();
                                                            str8 = this.zza;
                                                            zzavVarZzj2.zzaw();
                                                            zzavVarZzj2.zzg();
                                                            Preconditions.checkNotEmpty(str8);
                                                            Preconditions.checkNotEmpty(strZzc);
                                                            aVar5 = new androidx.collection.a();
                                                            cursorQuery2 = zzavVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) aVar5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        aVar5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(zzfnVar3);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = aVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            aVar4.put(strZzc, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zZzd = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                    zzicVar = this.zzu;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                        zzgs zzgsVarZzk3 = zzicVar.zzaV().zzk();
                                                                        if (zzfnVar.zza()) {
                                                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                        zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                    }
                                                                    if (zzfnVar.zza()) {
                                                                    }
                                                                    zzgs zzgsVarZze3 = zzicVar.zzaV().zze();
                                                                    Object objZzl3 = zzgu.zzl(this.zza);
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf2));
                                                                    this.zzb.add(num4);
                                                                    map5 = map6;
                                                                    aVar4 = aVar4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    aVar4 = aVar4;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                                zzc(num4).zza(zzacVar);
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue6);
                                                    arrayList2.add(zzhgVarZzb2);
                                                    zzavVarZzj = this.zzg.zzj();
                                                    str7 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                                                    zzavVarZzj.zzaw();
                                                    zzavVarZzj.zzg();
                                                    Preconditions.checkNotEmpty(str7);
                                                    Preconditions.checkNotNull(zziiVarZzc2);
                                                    byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrZzcc2);
                                                    if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z12 = z13;
                                            str13 = str2;
                                            str14 = str14;
                                        } catch (SQLiteException e33) {
                                            e = e33;
                                            zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str16), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map16;
                                    z13 = z12;
                                    str2 = "data";
                                    str14 = "audience_id";
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e34) {
                            e = e34;
                            z13 = z12;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z13) {
                                String str18 = this.zza;
                                zzav zzavVarZzj8 = this.zzg.zzj();
                                str3 = this.zza;
                                zzavVarZzj8.zzaw();
                                zzavVarZzj8.zzg();
                                Preconditions.checkNotEmpty(str3);
                                aVar2 = new androidx.collection.a();
                                sQLiteDatabaseZze = zzavVarZzj8.zze();
                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) aVar2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            aVar2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    aVar2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                Preconditions.checkNotEmpty(str18);
                                Preconditions.checkNotNull(map2);
                                aVar3 = new androidx.collection.a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                        list4 = (List) aVar2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = aVar2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        aVar3.put(num, zziiVar3);
                                        aVar2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = aVar3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                aVar = new androidx.collection.a();
                                if (zziiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzhqVar.zza()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
                                            if (zzhqVar.zzc()) {
                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                androidx.collection.a aVar12 = new androidx.collection.a();
                                if (zziiVar != null) {
                                    it = zziiVar.zzg().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                        if (!zzikVar.zza()) {
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                if (zziiVar2 != null) {
                                    i13 = 0;
                                    while (i13 < zziiVar2.zzb() * 64) {
                                        if (zzpk.zzn(zziiVar2.zza(), i13)) {
                                            z14 = zZzp;
                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i13));
                                            bitSet2.set(i13);
                                            if (zzpk.zzn(zziiVar2.zzc(), i13)) {
                                                bitSet.set(i13);
                                            }
                                            i13++;
                                            zZzp = z14;
                                        } else {
                                            z14 = zZzp;
                                        }
                                        aVar.remove(Integer.valueOf(i13));
                                        i13++;
                                        zZzp = z14;
                                    }
                                }
                                boolean z17 = zZzp;
                                com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                if (!zZzp2) {
                                }
                                this.zzc.put(num3, new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, aVar, aVar12, null));
                                str2 = str2;
                                map = map;
                                str14 = str14;
                                map2 = map2;
                                zZzp = z17;
                                map3 = map18;
                            }
                        }
                        str4 = str2;
                        str5 = str14;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this, null);
                            aVar6 = new androidx.collection.a();
                            it7 = list.iterator();
                            while (it7.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                if (zzhsVarZza != null) {
                                    zzpgVar = this.zzg;
                                    zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                    zzpgVar.zzj().zzh(zzbcVarZzaf);
                                    if (z11) {
                                        j11 = zzbcVarZzaf.zzc;
                                        strZzd = zzhsVarZza.zzd();
                                        map7 = (Map) aVar6.get(strZzd);
                                        if (map7 == null) {
                                            zzavVarZzj3 = zzpgVar.zzj();
                                            str10 = this.zza;
                                            zzavVarZzj3.zzaw();
                                            zzavVarZzj3.zzg();
                                            Preconditions.checkNotEmpty(str10);
                                            Preconditions.checkNotEmpty(strZzd);
                                            aVar7 = new androidx.collection.a();
                                            str11 = str10;
                                            cursorQuery3 = zzavVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                zzbcVar = zzbcVarZzaf;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbc();
                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) aVar7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        aVar7.put(numValueOf5, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(zzffVar7);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map7 = aVar7;
                                            } else {
                                                zzbcVar = zzbcVarZzaf;
                                                map7 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            aVar6.put(strZzd, map7);
                                        } else {
                                            zzbcVar = zzbcVarZzaf;
                                        }
                                        it8 = map7.keySet().iterator();
                                        while (it8.hasNext()) {
                                            num2 = (Integer) it8.next();
                                            iIntValue = num2.intValue();
                                            if (this.zzb.contains(num2)) {
                                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                                            } else {
                                                it9 = ((List) map7.get(num2)).iterator();
                                                zZzd2 = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map8 = map7;
                                                        it10 = it8;
                                                        j12 = j11;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                    map8 = map7;
                                                    it10 = it8;
                                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar8);
                                                    j12 = j11;
                                                    zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar8.zzb()));
                                                    if (!zZzd2) {
                                                        this.zzb.add(num2);
                                                        break;
                                                    }
                                                    zzc(num2).zza(zzaaVar);
                                                    j11 = j12;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                                if (!zZzd2) {
                                                    this.zzb.add(num2);
                                                }
                                                j11 = j12;
                                                map7 = map8;
                                                it8 = it10;
                                            }
                                        }
                                        it7 = it7;
                                        zzzVar = zzzVar;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z11) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            aVar4 = new androidx.collection.a();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                strZzc = zziuVar3.zzc();
                                map5 = (Map) aVar4.get(strZzc);
                                if (map5 == null) {
                                    zzavVarZzj2 = this.zzg.zzj();
                                    str8 = this.zza;
                                    zzavVarZzj2.zzaw();
                                    zzavVarZzj2.zzg();
                                    Preconditions.checkNotEmpty(str8);
                                    Preconditions.checkNotEmpty(strZzc);
                                    aVar5 = new androidx.collection.a();
                                    cursorQuery2 = zzavVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) aVar5.get(numValueOf4);
                                            if (list5 == null) {
                                                it5 = it4;
                                                arrayList3 = new ArrayList();
                                                aVar5.put(numValueOf4, arrayList3);
                                            } else {
                                                it5 = it4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(zzfnVar4);
                                            str9 = str8;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it4 = it5;
                                            str8 = str9;
                                        }
                                        cursorQuery2.close();
                                        map5 = aVar5;
                                    } else {
                                        it5 = it4;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    aVar4.put(strZzc, map5);
                                } else {
                                    it5 = it4;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaV().zzk().zzb(str6, num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map5.get(num4)).iterator();
                                    zZzd = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                            zzicVar = this.zzu;
                                            map6 = map5;
                                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                zzgs zzgsVarZzk4 = zzicVar.zzaV().zzk();
                                                if (zzfnVar.zza()) {
                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                            }
                                            if (zzfnVar.zza()) {
                                            }
                                            zzgs zzgsVarZze4 = zzicVar.zzaV().zze();
                                            Object objZzl4 = zzgu.zzl(this.zza);
                                            if (zzfnVar.zza()) {
                                                numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf2));
                                            this.zzb.add(num4);
                                            map5 = map6;
                                            aVar4 = aVar4;
                                            str6 = str6;
                                        } else {
                                            map6 = map5;
                                            str6 = str6;
                                            aVar4 = aVar4;
                                        }
                                        if (!zZzd) {
                                            this.zzb.add(num4);
                                        }
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                        zzc(num4).zza(zzacVar);
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                    }
                                }
                                it4 = it5;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            zzy zzyVar3 = (zzy) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzyVar3);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue8);
                            arrayList2.add(zzhgVarZzb3);
                            zzavVarZzj = this.zzg.zzj();
                            str7 = this.zza;
                            com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
                            zzavVarZzj.zzaw();
                            zzavVarZzj.zzg();
                            Preconditions.checkNotEmpty(str7);
                            Preconditions.checkNotNull(zziiVarZzc3);
                            byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str7);
                            contentValues.put(str5, num5);
                            contentValues.put("current_results", bArrZzcc3);
                            if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                            }
                        }
                        return arrayList2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e35) {
                e = e35;
                cursorQuery4 = null;
            } catch (Throwable th12) {
                th = th12;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        zzav zzavVarZzj9 = this.zzg.zzj();
        String str19 = this.zza;
        zzavVarZzj9.zzaw();
        zzavVarZzj9.zzg();
        Preconditions.checkNotEmpty(str19);
        try {
            cursorQuery = zzavVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z13 = z12;
                str2 = "data";
                str14 = "audience_id";
            } else {
                aVar8 = new androidx.collection.a();
                while (true) {
                    i14 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i14), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                    z13 = z12;
                    str2 = str13;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z12 = z13;
                    str13 = str2;
                    str14 = str14;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e36) {
            e = e36;
            z13 = z12;
            str2 = "data";
            str14 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th13) {
            th = th13;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z13) {
                String str110 = this.zza;
                zzav zzavVarZzj10 = this.zzg.zzj();
                str3 = this.zza;
                zzavVarZzj10.zzaw();
                zzavVarZzj10.zzg();
                Preconditions.checkNotEmpty(str3);
                aVar2 = new androidx.collection.a();
                sQLiteDatabaseZze = zzavVarZzj10.zze();
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str110);
                Preconditions.checkNotNull(map2);
                aVar3 = new androidx.collection.a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        list4 = (List) aVar2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            aVar3.put(num, zziiVar3);
                            aVar2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            zzpg zzpgVar2 = this.zzg;
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            List listZzq = zzpgVar2.zzp().zzq(zziiVar3.zzc(), list4);
                            if (listZzq.isEmpty()) {
                                aVar2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar2.zzp().zzq(zziiVar3.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = zziiVar3.zze().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.zzg()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                aVar3.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                aVar2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = aVar3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new androidx.collection.a();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r7.hasNext()) {
                        if (zzhqVar.zza()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                androidx.collection.a aVar13 = new androidx.collection.a();
                if (zziiVar != null && zziiVar.zzh() != 0) {
                    it = zziiVar.zzg().iterator();
                    while (it.hasNext()) {
                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            aVar13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            it = it;
                            zziiVar = zziiVar;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                if (zziiVar2 != null) {
                    i13 = 0;
                    while (i13 < zziiVar2.zzb() * 64) {
                        if (zzpk.zzn(zziiVar2.zza(), i13)) {
                            z14 = zZzp;
                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i13));
                            bitSet2.set(i13);
                            if (zzpk.zzn(zziiVar2.zzc(), i13)) {
                                bitSet.set(i13);
                            }
                            i13++;
                            zZzp = z14;
                        } else {
                            z14 = zZzp;
                        }
                        aVar.remove(Integer.valueOf(i13));
                        i13++;
                        zZzp = z14;
                    }
                }
                boolean z18 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar7 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                if (!zZzp2 && z18 && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it15.next();
                        int iZzb = zzffVar9.zzb();
                        Iterator it16 = it15;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar9.zzj()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (aVar.containsKey(numValueOf11)) {
                            aVar.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf11)) {
                            aVar13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.zzc.put(num3, new zzy(this, this.zza, zziiVar7, bitSet, bitSet2, aVar, aVar13, null));
                str2 = str2;
                map = map;
                str14 = str14;
                map2 = map2;
                zZzp = z18;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str14;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            aVar6 = new androidx.collection.a();
            it7 = list.iterator();
            while (it7.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpgVar = this.zzg;
                    zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar.zzj().zzh(zzbcVarZzaf);
                    if (z11) {
                        j11 = zzbcVarZzaf.zzc;
                        strZzd = zzhsVarZza.zzd();
                        map7 = (Map) aVar6.get(strZzd);
                        if (map7 == null) {
                            zzavVarZzj3 = zzpgVar.zzj();
                            str10 = this.zza;
                            zzavVarZzj3.zzaw();
                            zzavVarZzj3.zzg();
                            Preconditions.checkNotEmpty(str10);
                            Preconditions.checkNotEmpty(strZzd);
                            aVar7 = new androidx.collection.a();
                            str11 = str10;
                            cursorQuery3 = zzavVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                zzbcVar = zzbcVarZzaf;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbc();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) aVar7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        aVar7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(zzffVar10);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map7 = aVar7;
                            } else {
                                zzbcVar = zzbcVarZzaf;
                                map7 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            aVar6.put(strZzd, map7);
                        } else {
                            zzbcVar = zzbcVarZzaf;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.zzb.contains(num2)) {
                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zZzd2 = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j12 = j11;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar11);
                                    j12 = j11;
                                    zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar11.zzb()));
                                    if (!zZzd2) {
                                        this.zzb.add(num2);
                                        break;
                                    }
                                    zzc(num2).zza(zzaaVar);
                                    j11 = j12;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num2);
                                }
                                j11 = j12;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        zzzVar = zzzVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z11) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            aVar4 = new androidx.collection.a();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                strZzc = zziuVar4.zzc();
                map5 = (Map) aVar4.get(strZzc);
                if (map5 == null) {
                    zzavVarZzj2 = this.zzg.zzj();
                    str8 = this.zza;
                    zzavVarZzj2.zzaw();
                    zzavVarZzj2.zzg();
                    Preconditions.checkNotEmpty(str8);
                    Preconditions.checkNotEmpty(strZzc);
                    aVar5 = new androidx.collection.a();
                    cursorQuery2 = zzavVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) aVar5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                aVar5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(zzfnVar5);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        cursorQuery2.close();
                        map5 = aVar5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    aVar4.put(strZzc, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzu.zzaV().zzk().zzb(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zZzd = true;
                    while (true) {
                        if (it6.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                            zzicVar = this.zzu;
                            map6 = map5;
                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                zzgs zzgsVarZzk5 = zzicVar.zzaV().zzk();
                                if (zzfnVar.zza()) {
                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzgsVarZzk5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                zzgs zzgsVarZze5 = zzicVar.zzaV().zze();
                                Object objZzl5 = zzgu.zzl(this.zza);
                                if (zzfnVar.zza()) {
                                    numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf2 = null;
                                }
                                zzgsVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf2));
                                this.zzb.add(num4);
                                map5 = map6;
                                aVar4 = aVar4;
                                str6 = str6;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue9, zzfnVar);
                                zZzd = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue9, zzfnVar.zzb()));
                                if (zZzd) {
                                    zzc(num4).zza(zzacVar);
                                    map5 = map6;
                                    aVar4 = aVar4;
                                    str6 = str6;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            aVar4 = aVar4;
                        }
                        if (!zZzd) {
                            this.zzb.add(num4);
                        }
                        map5 = map6;
                        aVar4 = aVar4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzy zzyVar4 = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue10);
            arrayList2.add(zzhgVarZzb4);
            zzavVarZzj = this.zzg.zzj();
            str7 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc4 = zzhgVarZzb4.zzc();
            zzavVarZzj.zzaw();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(str7);
            Preconditions.checkNotNull(zziiVarZzc4);
            byte[] bArrZzcc4 = zziiVarZzc4.zzcc();
            contentValues = new ContentValues();
            contentValues.put("app_id", str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrZzcc4);
            if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }
}
