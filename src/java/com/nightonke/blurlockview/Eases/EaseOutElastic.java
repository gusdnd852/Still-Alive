package com.nightonke.blurlockview.Eases;

public class EaseOutElastic extends CubicBezier {
    public float getOffset(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        f /= 1.0f;
        return f == 1.0f ? 1.0f : (((((float) Math.pow(2.0d, (double) (-10.0f * f))) * 1.0f) * ((float) Math.sin((double) ((((f * 1.0f) - 0.075f) * 6.2831855f) / 0.3f)))) + 1.0f) + 0.0f;
    }
}
