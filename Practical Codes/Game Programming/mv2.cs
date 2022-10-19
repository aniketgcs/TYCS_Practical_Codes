using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Move : MonoBehaviour
{
    public Rigidbody rb;
    public float h, v, speed = 10.0f;
    // Start is called before the first frame update
    void Start()
    {
        rb = GetComponent<Rigidbody>();
    }

    // Update is called once per frame
    void Update()
    {
        h = Input.GetAxis("Horizontal");
        v = Input.GetAxis("Vertical");
    }

    public void FixedUpdate()
    {
        rb.AddForce(new Vector3(h,0.0f,v)*speed);
    }
}
