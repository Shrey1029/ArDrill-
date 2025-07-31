package com.example.arassignment

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.math.Vector3
import com.google.ar.sceneform.rendering.Color as SceneformColor
import com.google.ar.sceneform.rendering.MaterialFactory
import com.google.ar.sceneform.rendering.ShapeFactory
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode

class ArActivity : AppCompatActivity() {

    private lateinit var arFragment: ArFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar)

        arFragment = supportFragmentManager.findFragmentById(R.id.arFragment) as ArFragment

        arFragment.setOnTapArPlaneListener { hitResult, plane, motionEvent ->
            MaterialFactory.makeOpaqueWithColor(this, SceneformColor(Color.BLUE))
                .thenAccept { material ->
                    val cube = ShapeFactory.makeCube(
                        Vector3(0.1f, 0.1f, 0.1f), // size of cube
                        Vector3(0f, 0.05f, 0f),   // center
                        material
                    )

                    val anchor = hitResult.createAnchor()
                    val anchorNode = AnchorNode(anchor)
                    anchorNode.setParent(arFragment.arSceneView.scene)

                    val node = TransformableNode(arFragment.transformationSystem)
                    node.setParent(anchorNode)
                    node.renderable = cube
                    node.select()
                }
        }
    }
}
