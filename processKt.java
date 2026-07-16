ProcessKt.java                              
package kotlin.system;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Metadata;
import o.aemv;
import o.fyh;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\bÂ¨\u0006\u0004"}, d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes12.dex */
public final class ProcessKt {
    private static char[] b = {61285, 61272, 61208, 61263, 61265, 61262, 61267, 61271, 61286, 61253, 61276, 61274, 61250, 61275, 61248, 61279};
    private static char c = 55976;

    private static final Void exitProcess(int i) {
        try {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = new Object[1];
            a(16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (26 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{11, 6, 15, 6, 3, '\n', 5, 3, 6, 0, 1, 0, '\b', '\r', 5, 14}, objArr2);
            Class cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(Color.red(0) + 4, (byte) (5 - (ViewConfiguration.getTapTimeout() >> 16)), new char[]{7, 6, '\f', '\r'}, objArr3);
            cls.getMethod((String) objArr3[0], new Class[]{Integer.TYPE}).invoke((Object) null, objArr);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void a(int i, byte b2, char[] cArr, Object[] objArr) {
        int i2;
        Object obj;
        aemv aemvVar = new aemv();
        char[] cArr2 = b;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object e = fyh.e(-1566199151);
                    if (e == null) {
                        e = fyh.d((char) (KeyEvent.getMaxKeyCode() >> 16), 7 - TextUtils.indexOf("", "", 0), View.resolveSize(0, 0) + 7809, 810771579, false, "p", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) e).invoke((Object) null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(c)};
        Object e2 = fyh.e(-1566199151);
        if (e2 == null) {
            e2 = fyh.d((char) Color.green(0), 7 - Color.red(0), 7808 - TextUtils.indexOf("", '0', 0), 810771579, false, "p", new Class[]{Integer.TYPE});
        }
        char charValue = ((Character) ((Method) e2).invoke((Object) null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aemvVar.b = 0;
            while (aemvVar.b < i2) {
                aemvVar.c = cArr[aemvVar.b];
                aemvVar.d = cArr[aemvVar.b + 1];
                if (aemvVar.c == aemvVar.d) {
                    cArr4[aemvVar.b] = (char) (aemvVar.c - b2);
                    cArr4[aemvVar.b + 1] = (char) (aemvVar.d - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {aemvVar, aemvVar, Integer.valueOf(charValue), aemvVar, aemvVar, Integer.valueOf(charValue), aemvVar, aemvVar, Integer.valueOf(charValue), aemvVar, aemvVar, Integer.valueOf(charValue), aemvVar};
                    Object e3 = fyh.e(-679368945);
                    if (e3 == null) {
                        e3 = fyh.d((char) (59112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 86 - Color.alpha(0), 7493 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1165455845, false, "s", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) e3).invoke((Object) null, objArr4)).intValue() == aemvVar.g) {
                        Object[] objArr5 = {aemvVar, aemvVar, Integer.valueOf(charValue), Integer.valueOf(charValue), aemvVar, aemvVar, Integer.valueOf(charValue), Integer.valueOf(charValue), aemvVar, Integer.valueOf(charValue), aemvVar};
                        Object e4 = fyh.e(-1285633924);
                        if (e4 == null) {
                            e4 = fyh.d((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, (ViewConfiguration.getJumpTapTimeout() >> 16) + 5253, 564666006, false, "r", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int intValue = ((Integer) ((Method) e4).invoke((Object) null, objArr5)).intValue();
                        int i4 = (aemvVar.a * charValue) + aemvVar.g;
                        cArr4[aemvVar.b] = cArr2[intValue];
                        cArr4[aemvVar.b + 1] = cArr2[i4];
                    } else {
                        obj = null;
                        if (aemvVar.e == aemvVar.a) {
                            aemvVar.i = ((aemvVar.i + charValue) - 1) % charValue;
                            aemvVar.g = ((aemvVar.g + charValue) - 1) % charValue;
                            int i5 = (aemvVar.e * charValue) + aemvVar.i;
                            int i6 = (aemvVar.a * charValue) + aemvVar.g;
                            cArr4[aemvVar.b] = cArr2[i5];
                            cArr4[aemvVar.b + 1] = cArr2[i6];
                        } else {
                            int i7 = (aemvVar.e * charValue) + aemvVar.g;
                            int i8 = (aemvVar.a * charValue) + aemvVar.i;
                            cArr4[aemvVar.b] = cArr2[i7];
                            cArr4[aemvVar.b + 1] = cArr2[i8];
                        }
                    }
                }
                aemvVar.b += 2;
                obj2 = obj;
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            cArr4[i9] = (char) (cArr4[i9] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
