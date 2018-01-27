/**
 * 
 */
package jterrain.geomipmapping;

import jscenegraph.database.inventor.SbBox3f;
import jscenegraph.database.inventor.SbVec3f;
import jscenegraph.database.inventor.actions.SoAction;
import jscenegraph.database.inventor.fields.SoSFBool;
import jscenegraph.database.inventor.fields.SoSFInt32;
import jscenegraph.database.inventor.nodes.SoShape;

/**
 * @author Yves Boyadjian
 *
 */
public class SoSimpleGeoMipmapTerrain extends SoShape {
	
    /* Pole. */
    /// Velikost strany vstupn�vkov�mapy.
    public final SoSFInt32 mapSize = new SoSFInt32();
    /// Velikost strany dladic.
    public final SoSFInt32 tileSize = new SoSFInt32();
    /// Chyba zobrazen�v pixelech.
    public final SoSFInt32 pixelError = new SoSFInt32();
    /// P�nak oez���pohledovm t�esem.
    public final SoSFBool frustrumCulling = new SoSFBool();
    /// P�nak "zmrazen� vykreslov��ter�u.
    public final SoSFBool freeze = new SoSFBool();
	

	/* (non-Javadoc)
	 * @see jscenegraph.database.inventor.nodes.SoShape#computeBBox(jscenegraph.database.inventor.actions.SoAction, jscenegraph.database.inventor.SbBox3f, jscenegraph.database.inventor.SbVec3f)
	 */
	@Override
	public void computeBBox(SoAction action, SbBox3f box, SbVec3f center) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see jscenegraph.database.inventor.nodes.SoShape#generatePrimitives(jscenegraph.database.inventor.actions.SoAction)
	 */
	@Override
	protected void generatePrimitives(SoAction action) {
		// TODO Auto-generated method stub

	}

}
