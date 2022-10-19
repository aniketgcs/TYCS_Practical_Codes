using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Move : MonoBehaviour
{
    public Rigidbody rb;
    public float h, v, speed = 10.0f; int count = 0;
    public Text ct;
    // Start is called before the first frame update
    void Start()
    {
        rb = GetComponent<Rigidbody>();
        count = 0;
        ct.text = "";
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
    private void OnTriggerEnter(Collider other)
    {
        if (other.gameObject.CompareTag("sp"))
        {
            other.gameObject.SetActive(false); count++;
        }

        if (other.gameObject.CompareTag("sp1"))
        {
            other.gameObject.SetActive(false); count++;
        }
        if (other.gameObject.CompareTag("sp2"))
        {
            other.gameObject.SetActive(false); count++;
        }
        ct.text = "done"+count;
    }
}
