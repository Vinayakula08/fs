#include<stdio.h>
#include<stdlib.h>
struct BST
{
	int info;
	struct BST *left,*right;
};
struct BST *root=NULL;
struct BST *create(int, struct BST * );
 int height(struct BST *);
 void leaf_count(struct BST *,int *);
 void total(struct BST *,int *); 
  int search(struct BST *,int);
 void preorder(struct BST *);
 void postorder(struct BST *);
 void inorder(struct BST *);
 void main()
 {
	 int tp=0,t=0,flag=0,h=0;

			root= create(10,root);
			root= create(5,root);
			root= create(15,root);
			root= create(3,root);
			root= create(6,root);
			root= create(14,root);
			root= create(16,root);
	printf("\nIn order ");
		      inorder(root);
 	printf("\nPre order ");
		      preorder(root);
   	printf("\nPost order ");
		      postorder(root);
			   h=height(root);
		      printf("\nTHe Height of the BST  is %d",h);
				leaf_count(root,&tp);
				    printf("\nNo. of leaf nodes in the BST = %d",tp);
					  flag=search(root,14);
					  if(flag==1)
						  printf("\nElement is present in the BST");
					   else
						   printf("\nElement is not present in the BST");
					   total(root,&t);
					   printf("\nTotal No. of Nodes in the BST = %d",t);
 }


 struct BST *create(int data,struct BST *p)
 {
	 if(!p)
	 {
		 p=(struct BST *) malloc(sizeof(struct BST));
		 p->info=data;
		 p->left=NULL;
		 p->right=NULL;
		 return (p);
	 }
	 
		 if(data<p->info)
	 			 p->left=create(data,p->left);
		 if(data>p->info)
			    p->right=create(data,p->right);
		 return p;
 }

 

 void preorder(struct BST *t)
 {
	 if(t)
	 {
		 printf(" %d  ",t->info);
		 preorder(t->left);
		 preorder(t->right);
	 }
 }

 void inorder(struct BST *t)
 {
	 if(t)
	 {
		 inorder(t->left);
		 printf("%d\t",t->info);
		 inorder(t->right);
	 }
 }

 void postorder(struct BST *t)
 {
	 if(t)
	 {
		 postorder(t->left);
		 postorder(t->right);
		 printf("%d\t",t->info);
	 }
 }

 int height(struct BST *t)
 {
	 int hleft,hright;
	 if(t==NULL)
		 return -1;
	 hleft=height(t->left);
	 hright=height(t->right);
	 if(hleft>hright)
		 return (++hleft);
	 else
		 return (++hright);
 }

 void leaf_count(struct BST *t,int *count)
 {
 if( (t->left) && (t->right) )
 {
	 leaf_count(t->left,count);
	 leaf_count(t->right,count);
 }
 else
 ++(*count);
 }

 int search(struct BST *t, int x)
 {
	 if(t == NULL)
		 return 0;
	 else if(x==t->info)
		 return 1;
	 else if(x<t->info)
		  return (search(t->left,x));
	 else
		 return (search(t->right,x));
 }


 void total(struct BST *t,int *c)
 {
	 if(t)
	 {
		 ++(*c);
		 total(t->left,c);
		 total(t->right,c);
	 }
 }	
