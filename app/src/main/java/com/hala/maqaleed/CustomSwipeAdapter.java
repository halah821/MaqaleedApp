package com.hala.maqaleed;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Hala on 3/24/2016.
 */
public class CustomSwipeAdapter extends PagerAdapter {

    private int[] resources = {R.drawable.page_000,
            R.drawable.page_001,
            R.drawable.page_002,
            R.drawable.page_003,
            R.drawable.page_004,
            R.drawable.page_005,
            R.drawable.page_006,
            R.drawable.page_007,
            R.drawable.page_008,
            R.drawable.page_009,
            R.drawable.page_010,
            R.drawable.page_011,
            R.drawable.page_012,
            R.drawable.page_013,
            R.drawable.page_014,
            R.drawable.page_015,
            R.drawable.page_016,
            R.drawable.page_017,
            R.drawable.page_018,
            R.drawable.page_019,
            R.drawable.page_020,
            R.drawable.page_021,
            R.drawable.page_022,
            R.drawable.page_023,
            R.drawable.page_024,
            R.drawable.page_025,
            R.drawable.page_026,
            R.drawable.page_027,
            R.drawable.page_028,
            R.drawable.page_029,
            R.drawable.page_030,
            R.drawable.page_031,
            R.drawable.page_032,
            R.drawable.page_033,
            R.drawable.page_034,
            R.drawable.page_035,
            R.drawable.page_036,
            R.drawable.page_037,
            R.drawable.page_038,
            R.drawable.page_039,
            R.drawable.page_040,
            R.drawable.page_041,
            R.drawable.page_042,
            R.drawable.page_043,
            R.drawable.page_044,
            R.drawable.page_045,
            R.drawable.page_046,
            R.drawable.page_047,
            R.drawable.page_048,
            R.drawable.page_049,
            R.drawable.page_050,
            R.drawable.page_051,
            R.drawable.page_052,
            R.drawable.page_053,
            R.drawable.page_054,
            R.drawable.page_055,
            R.drawable.page_056,
            R.drawable.page_057,
            R.drawable.page_058,
            R.drawable.page_059,
            R.drawable.page_060,
            R.drawable.page_061,
            R.drawable.page_062,
            R.drawable.page_063,
            R.drawable.page_064,
            R.drawable.page_065,
            R.drawable.page_066,
            R.drawable.page_067,
            R.drawable.page_068,
            R.drawable.page_069,
            R.drawable.page_070,
            R.drawable.page_071,
            R.drawable.page_072,
            R.drawable.page_073,
            R.drawable.page_074,
            R.drawable.page_075,
            R.drawable.page_076,
            R.drawable.page_077,
            R.drawable.page_078,
            R.drawable.page_079,
            R.drawable.page_080,
            R.drawable.page_081,
            R.drawable.page_082,
            R.drawable.page_083,
            R.drawable.page_084,
            R.drawable.page_085,
            R.drawable.page_086,
            R.drawable.page_087,
            R.drawable.page_088,
            R.drawable.page_089,
            R.drawable.page_090,
            R.drawable.page_091,
            R.drawable.page_092,
            R.drawable.page_093,
            R.drawable.page_094,
            R.drawable.page_095,
            R.drawable.page_096,
            R.drawable.page_097,
            R.drawable.page_098,
            R.drawable.page_099,
            R.drawable.page_100,
            R.drawable.page_101,
            R.drawable.page_102,
            R.drawable.page_103,
            R.drawable.page_104,
            R.drawable.page_105,
            R.drawable.page_106,
            R.drawable.page_107,
            R.drawable.page_108,
            R.drawable.page_109,
            R.drawable.page_110,
            R.drawable.page_111,
            R.drawable.page_112,
            R.drawable.page_113,
            R.drawable.page_114,
            R.drawable.page_115,
            R.drawable.page_116,
            R.drawable.page_117,
            R.drawable.page_118,
            R.drawable.page_119,
            R.drawable.page_120,
            R.drawable.page_121,
            R.drawable.page_122,
            R.drawable.page_123,
            R.drawable.page_124,
            R.drawable.page_125,
            R.drawable.page_126,
            R.drawable.page_127,
            R.drawable.page_128,
            R.drawable.page_129,
            R.drawable.page_130,
            R.drawable.page_131,
            R.drawable.page_132,
            R.drawable.page_133,
            R.drawable.page_134,
            R.drawable.page_135,
            R.drawable.page_136,
            R.drawable.page_137,
            R.drawable.page_138,
            R.drawable.page_139,
            R.drawable.page_140,
            R.drawable.page_141,
            R.drawable.page_142,
            R.drawable.page_143,
            R.drawable.page_144,
            R.drawable.page_145,
            R.drawable.page_146,
            R.drawable.page_147,
            R.drawable.page_148,
            R.drawable.page_149,
            R.drawable.page_150,
            R.drawable.page_151,
            R.drawable.page_152,
            R.drawable.page_153,
            R.drawable.page_154,
            R.drawable.page_155,
            R.drawable.page_156,
            R.drawable.page_157,
            R.drawable.page_158,
            R.drawable.page_159,
            R.drawable.page_160,
            R.drawable.page_161,
            R.drawable.page_162,
            R.drawable.page_163,
            R.drawable.page_164,
            R.drawable.page_165,
            R.drawable.page_166,
            R.drawable.page_167,
            R.drawable.page_168,
            R.drawable.page_169,
            R.drawable.page_170,
            R.drawable.page_171,
            R.drawable.page_172,
            R.drawable.page_173,
            R.drawable.page_174,
            R.drawable.page_175,
            R.drawable.page_176,
            R.drawable.page_177,
            R.drawable.page_178,
            R.drawable.page_179,
            R.drawable.page_180,
            R.drawable.page_181,
            R.drawable.page_182,
            R.drawable.page_183,
            R.drawable.page_184,
            R.drawable.page_185,
            R.drawable.page_186,
            R.drawable.page_187,
            R.drawable.page_188,
            R.drawable.page_189,
            R.drawable.page_190,
            R.drawable.page_191,
            R.drawable.page_192,
            R.drawable.page_193,
            R.drawable.page_194,
            R.drawable.page_195,
            R.drawable.page_196,
            R.drawable.page_197,
            R.drawable.page_198,
            R.drawable.page_199,
            R.drawable.page_200,
            R.drawable.page_201,
            R.drawable.page_202,
            R.drawable.page_203,
            R.drawable.page_204,
            R.drawable.page_205,
            R.drawable.page_206,
            R.drawable.page_207,
            R.drawable.page_208,
            R.drawable.page_209,
            R.drawable.page_210,
            R.drawable.page_211,
            R.drawable.page_212,
            R.drawable.page_213,
            R.drawable.page_214,
            R.drawable.page_215,
            R.drawable.page_216,
            R.drawable.page_217,
            R.drawable.page_218,
            R.drawable.page_219,
            R.drawable.page_220,
            R.drawable.page_221,
            R.drawable.page_222,
            R.drawable.page_223,
            R.drawable.page_224,
            R.drawable.page_225,
            R.drawable.page_226,
            R.drawable.page_227,
            R.drawable.page_228,
            R.drawable.page_229,
            R.drawable.page_230,
            R.drawable.page_231,
            R.drawable.page_232,
            R.drawable.page_233
    };


    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.fragment_one_layout,container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.image_view);
        imageView.setImageResource(resources[233-position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}

